/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.area.camt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.CashManagementArchive;
import com.tools20022.repository.choice.UnderlyingTransaction2Choice;
import com.tools20022.repository.msg.Case3;
import com.tools20022.repository.msg.CaseAssignment3;
import com.tools20022.repository.msg.MissingCover3;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * Scope The Claim Non Receipt message is sent by a case creator/case assigner
 * to a case assignee. This message is used to initiate an investigation for
 * missing funds at the creditor (missing credit entry to its account) or at an
 * agent along the processing chain (missing cover for a received payment
 * instruction). Usage The claim non receipt case occurs in two situations: -
 * The creditor is expecting funds from a particular debtor and cannot find the
 * corresponding credit entry on its account. In this situation, it is
 * understood that the creditor will contact its debtor, and that the debtor
 * will trigger the claim non receipt case on its behalf. A workflow where the
 * creditor directly addresses a Claim Non Receipt message to its account
 * servicing institution is not retained. - An agent in the processing chain
 * cannot find a cover payment corresponding to a received payment instruction.
 * In this situation, the agent may directly trigger the investigation by
 * sending a Claim Non Receipt message to the sender of the original payment
 * instruction. The Claim Non Receipt message covers one and only one payment
 * instruction at a time. If several expected payment instructions/cover
 * instructions are found missing, then multiple Claim Non Receipt messages must
 * be sent. Depending on the result of the investigation by a case assignee
 * (incorrect routing, errors/omissions when processing the instruction or even
 * the absence of an error) and the stage at which the payment instruction is
 * being process, the claim non receipt case may lead to a: - Request To Cancel
 * Payment message, sent to the subsequent agent in the payment processing
 * chain, if the original payment instruction has been incorrectly routed
 * through the chain of agents. (This also implies that a new, corrected,
 * payment instruction is issued). - Request To Modify Payment message, sent to
 * the subsequent agent in the payment processing chain, if a truncation or
 * omission has occurred during the processing of the original payment
 * instruction. If the above situations occur, the assignee wanting to request a
 * payment cancellation or payment modification should first send out a
 * Resolution Of Investigation with a confirmation status that indicates that
 * either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will
 * follow. (See section on Resolution Of Investigation for more details). In the
 * cover is missing, the case assignee may also simply issue the omitted cover
 * payment or when the initial cover information was incorrect, update the cover
 * (through modification and/or cancellation as required) with the correction
 * information provided in the ClaimNonReceipt message. The case assignee will
 * issue a Resolution Of Investigation message with the CorrectionTransaction
 * element mentioning the references of the cover payment. The Claim Non Receipt
 * message may be forwarded to subsequent case assignees. The ClaimNonReceipt
 * message has the following main characteristics: - Case Identification: The
 * case creator assigns a unique case identification. This information will be
 * passed unchanged to subsequent case assignee(s). - Underlying Payment: The
 * case creator refers to the underlying payment instruction for the unambiguous
 * identification of the payment instruction. This identification needs to be
 * updated by the subsequent case assigner(s) in order to match the one used
 * with their case assignee(s). - MissingCoverIndicator: The
 * MissingCoverIndication element distinguishes between a missing cover
 * situation (when set to YES) or a missing funds situation (when set to NO). -
 * CoverCorrection The CoverCorrection element allows the case assigner to
 * provide corrected cover information, when these are incorrect in the
 * underlying payment instruction for which the cover is issued.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmAssignment
 * ClaimNonReceiptV04.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmCase
 * ClaimNonReceiptV04.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmUnderlying
 * ClaimNonReceiptV04.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmCoverDetails
 * ClaimNonReceiptV04.mmCoverDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04#mmSupplementaryData
 * ClaimNonReceiptV04.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ClmNonRct"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.027.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClaimNonReceiptV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\nUsage\nThe claim non receipt case occurs in two situations: \n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a: \n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\nThe Claim Non Receipt message may be forwarded to subsequent case assignees.\nThe ClaimNonReceipt message has the following main characteristics: \n- Case Identification: \nThe case creator assigns a unique case identification. This information will be passed unchanged to subsequent case assignee(s).\n- Underlying Payment: \nThe case creator refers to the underlying payment instruction for the unambiguous identification of the payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- MissingCoverIndicator: \nThe MissingCoverIndication element distinguishes between a missing cover situation (when set to YES) or a missing funds situation (when set to NO).\n- CoverCorrection\nThe CoverCorrection element allows the case assigner to provide corrected cover information, when these are incorrect in the underlying payment instruction for which the cover is issued."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05
 * ClaimNonReceiptV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03
 * ClaimNonReceiptV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ClaimNonReceiptV04", propOrder = {"assignment", "case_", "underlying", "coverDetails", "supplementaryData"})
public class ClaimNonReceiptV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Assgnmt", required = true)
	protected CaseAssignment3 assignment;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment3
	 * CaseAssignment3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Assgnmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Assignment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmAssignment
	 * ClaimNonReceiptV05.mmAssignment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ClaimNonReceiptV04, CaseAssignment3> mmAssignment = new MMMessageBuildingBlock<ClaimNonReceiptV04, CaseAssignment3>() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmAssignment);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment3.mmObject();
		}

		@Override
		public CaseAssignment3 getValue(ClaimNonReceiptV04 obj) {
			return obj.getAssignment();
		}

		@Override
		public void setValue(ClaimNonReceiptV04 obj, CaseAssignment3 value) {
			obj.setAssignment(value);
		}
	};
	@XmlElement(name = "Case", required = true)
	protected Case3 case_;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case3 Case3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Case"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the investigation case."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmCase
	 * ClaimNonReceiptV05.mmCase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ClaimNonReceiptV04, Case3> mmCase = new MMMessageBuildingBlock<ClaimNonReceiptV04, Case3>() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmCase);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case3.mmObject();
		}

		@Override
		public Case3 getValue(ClaimNonReceiptV04 obj) {
			return obj.getCase();
		}

		@Override
		public void setValue(ClaimNonReceiptV04 obj, Case3 value) {
			obj.setCase(value);
		}
	};
	@XmlElement(name = "Undrlyg", required = true)
	protected UnderlyingTransaction2Choice underlying;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction2Choice
	 * UnderlyingTransaction2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Undrlyg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Underlying"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the payment instruction for which the Creditor has not received the funds.\nUsage: In case of a missing cover, it must be the identification of the related payment instruction.\nIn case of a claim non receipt initiated by the debtor, it must be the identification of the instruction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmUnderlying
	 * ClaimNonReceiptV05.mmUnderlying}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ClaimNonReceiptV04, UnderlyingTransaction2Choice> mmUnderlying = new MMMessageBuildingBlock<ClaimNonReceiptV04, UnderlyingTransaction2Choice>() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction for which the Creditor has not received the funds.\nUsage: In case of a missing cover, it must be the identification of the related payment instruction.\nIn case of a claim non receipt initiated by the debtor, it must be the identification of the instruction.";
			nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmUnderlying);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction2Choice.mmObject();
		}

		@Override
		public UnderlyingTransaction2Choice getValue(ClaimNonReceiptV04 obj) {
			return obj.getUnderlying();
		}

		@Override
		public void setValue(ClaimNonReceiptV04 obj, UnderlyingTransaction2Choice value) {
			obj.setUnderlying(value);
		}
	};
	@XmlElement(name = "CoverDtls")
	protected MissingCover3 coverDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MissingCover3
	 * MissingCover3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CoverDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CoverDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides the cover related information of a claim non receipt investigation. The absence of the component means that the message is not a cover related investigation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmCoverDetails
	 * ClaimNonReceiptV05.mmCoverDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ClaimNonReceiptV04, Optional<MissingCover3>> mmCoverDetails = new MMMessageBuildingBlock<ClaimNonReceiptV04, Optional<MissingCover3>>() {
		{
			xmlTag = "CoverDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverDetails";
			definition = "Provides the cover related information of a claim non receipt investigation. The absence of the component means that the message is not a cover related investigation.";
			nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmCoverDetails);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MissingCover3.mmObject();
		}

		@Override
		public Optional<MissingCover3> getValue(ClaimNonReceiptV04 obj) {
			return obj.getCoverDetails();
		}

		@Override
		public void setValue(ClaimNonReceiptV04 obj, Optional<MissingCover3> value) {
			obj.setCoverDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV05#mmSupplementaryData
	 * ClaimNonReceiptV05.mmSupplementaryData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<ClaimNonReceiptV04, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<ClaimNonReceiptV04, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmSupplementaryData);
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(ClaimNonReceiptV04 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(ClaimNonReceiptV04 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClaimNonReceiptV04";
				definition = "Scope\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\nUsage\nThe claim non receipt case occurs in two situations: \n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a: \n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\nThe Claim Non Receipt message may be forwarded to subsequent case assignees.\nThe ClaimNonReceipt message has the following main characteristics: \n- Case Identification: \nThe case creator assigns a unique case identification. This information will be passed unchanged to subsequent case assignee(s).\n- Underlying Payment: \nThe case creator refers to the underlying payment instruction for the unambiguous identification of the payment instruction. This identification needs to be updated by the subsequent case assigner(s) in order to match the one used with their case assignee(s).\n- MissingCoverIndicator: \nThe MissingCoverIndication element distinguishes between a missing cover situation (when set to YES) or a missing funds situation (when set to NO).\n- CoverCorrection\nThe CoverCorrection element allows the case assigner to provide corrected cover information, when these are incorrect in the underlying payment instruction for which the cover is issued.";
				nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV05.mmObject());
				previousVersion_lazy = () -> ClaimNonReceiptV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "ClmNonRct";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmAssignment, com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmCase,
						com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmUnderlying, com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmCoverDetails, com.tools20022.repository.area.camt.ClaimNonReceiptV04.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "027";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClaimNonReceiptV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public CaseAssignment3 getAssignment() {
		return assignment;
	}

	public ClaimNonReceiptV04 setAssignment(CaseAssignment3 assignment) {
		this.assignment = Objects.requireNonNull(assignment);
		return this;
	}

	public Case3 getCase() {
		return case_;
	}

	public ClaimNonReceiptV04 setCase(Case3 case_) {
		this.case_ = Objects.requireNonNull(case_);
		return this;
	}

	public UnderlyingTransaction2Choice getUnderlying() {
		return underlying;
	}

	public ClaimNonReceiptV04 setUnderlying(UnderlyingTransaction2Choice underlying) {
		this.underlying = Objects.requireNonNull(underlying);
		return this;
	}

	public Optional<MissingCover3> getCoverDetails() {
		return coverDetails == null ? Optional.empty() : Optional.of(coverDetails);
	}

	public ClaimNonReceiptV04 setCoverDetails(MissingCover3 coverDetails) {
		this.coverDetails = coverDetails;
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public ClaimNonReceiptV04 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:camt.027.001.04")
	static public class Document {
		@XmlElement(name = "ClmNonRct", required = true)
		public ClaimNonReceiptV04 messageBody;
	}
}