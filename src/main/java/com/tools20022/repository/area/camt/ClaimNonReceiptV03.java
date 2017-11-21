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
import com.tools20022.repository.choice.UnderlyingTransaction1Choice;
import com.tools20022.repository.msg.Case2;
import com.tools20022.repository.msg.CaseAssignment2;
import com.tools20022.repository.msg.MissingCover2;
import com.tools20022.repository.msgset.ISOArchive;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The Claim Non Receipt message is sent by a case creator/case assigner to a
 * case assignee.<br>
 * This message is used to initiate an investigation for missing funds at the
 * creditor (missing credit entry to its account) or at an agent along the
 * processing chain (missing cover for a received payment instruction).<br>
 * <b>Usage</b><br>
 * The claim non receipt case occurs in two situations:<br>
 * - The creditor is expecting funds from a particular debtor and cannot find
 * the corresponding credit entry on its account. In this situation, it is
 * understood that the creditor will contact its debtor, and that the debtor
 * will trigger the claim non receipt case on its behalf. A workflow where the
 * creditor directly addresses a Claim Non Receipt message to its account
 * servicing institution is not retained.<br>
 * - An agent in the processing chain cannot find a cover payment corresponding
 * to a received payment instruction. In this situation, the agent may directly
 * trigger the investigation by sending a Claim Non Receipt message to the
 * sender of the original payment instruction.<br>
 * The Claim Non Receipt message covers one and only one payment instruction at
 * a time. If several expected payment instructions/cover instructions are found
 * missing, then multiple Claim Non Receipt messages must be sent.<br>
 * Depending on the result of the investigation by a case assignee (incorrect
 * routing, errors/omissions when processing the instruction or even the absence
 * of an error) and the stage at which the payment instruction is being process,
 * the claim non receipt case may lead to a:<br>
 * - Request To Cancel Payment message, sent to the subsequent agent in the
 * payment processing chain, if the original payment instruction has been
 * incorrectly routed through the chain of agents. (This also implies that a
 * new, corrected, payment instruction is issued).<br>
 * - Request To Modify Payment message, sent to the subsequent agent in the
 * payment processing chain, if a truncation or omission has occurred during the
 * processing of the original payment instruction.<br>
 * If the above situations occur, the assignee wanting to request a payment
 * cancellation or payment modification should first send out a Resolution Of
 * Investigation with a confirmation status that indicates that either
 * cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will
 * follow. (See section on Resolution Of Investigation for more details).<br>
 * In the cover is missing, the case assignee may also simply issue the omitted
 * cover payment or when the initial cover information was incorrect, update the
 * cover (through modification and/or cancellation as required) with the
 * correction information provided in the ClaimNonReceipt message. The case
 * assignee will issue a Resolution Of Investigation message with the
 * CorrectionTransaction element mentioning the references of the cover payment.<br>
 * The Claim Non Receipt message may be forwarded to subsequent case assignees.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.CashManagementArchive
 * CashManagementArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "ClmNonRct"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmAssignment
 * ClaimNonReceiptV03.mmAssignment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmCase
 * ClaimNonReceiptV03.mmCase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmUnderlying
 * ClaimNonReceiptV03.mmUnderlying}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV03#mmCoverDetails
 * ClaimNonReceiptV03.mmCoverDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code camt.027.001.03}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ClaimNonReceiptV03"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\r\nUsage\r\nThe claim non receipt case occurs in two situations:\r\n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\r\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\r\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\r\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a:\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\r\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\r\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\r\nThe Claim Non Receipt message may be forwarded to subsequent case assignees."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.camt.ClaimNonReceiptV04
 * ClaimNonReceiptV04}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "ClaimNonReceiptV03", propOrder = {"assignment", "case", "underlying", "coverDetails"})
public class ClaimNonReceiptV03 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected CaseAssignment2 assignment;
	/**
	 * Identifies the assignment of an investigation case from an assigner to an
	 * assignee. Usage: The Assigner must be the sender of this confirmation and
	 * the Assignee must be the receiver.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CaseAssignment2
	 * CaseAssignment2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAssignment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Assgnmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Assignment";
			definition = "Identifies the assignment of an investigation case from an assigner to an assignee.\nUsage: The Assigner must be the sender of this confirmation and the Assignee must be the receiver.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CaseAssignment2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClaimNonReceiptV03.class.getMethod("getAssignment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Case2 case_;
	/**
	 * Identifies the investigation case.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Case2 Case2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCase = new MMMessageBuildingBlock() {
		{
			xmlTag = "Case";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Case";
			definition = "Identifies the investigation case.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> Case2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClaimNonReceiptV03.class.getMethod("getCase", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected UnderlyingTransaction1Choice underlying;
	/**
	 * Identifies the payment instruction for which the Creditor has not
	 * received the funds. Usage: In case of a missing cover, it must be the
	 * identification of the related payment instruction. In case of a claim non
	 * receipt initiated by the debtor, it must be the identification of the
	 * instruction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnderlyingTransaction1Choice
	 * UnderlyingTransaction1Choice}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmUnderlying = new MMMessageBuildingBlock() {
		{
			xmlTag = "Undrlyg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Underlying";
			definition = "Identifies the payment instruction for which the Creditor has not received the funds.\nUsage: In case of a missing cover, it must be the identification of the related payment instruction.\nIn case of a claim non receipt initiated by the debtor, it must be the identification of the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnderlyingTransaction1Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClaimNonReceiptV03.class.getMethod("getUnderlying", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MissingCover2 coverDetails;
	/**
	 * Provides the cover related information of a claim non receipt
	 * investigation. The absence of the component means that the message is not
	 * a cover related investigation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.MissingCover2
	 * MissingCover2}</li>
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
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmCoverDetails = new MMMessageBuildingBlock() {
		{
			xmlTag = "CoverDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CoverDetails";
			definition = "Provides the cover related information of a claim non receipt investigation. The absence of the component means that the message is not a cover related investigation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MissingCover2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return ClaimNonReceiptV03.class.getMethod("getCoverDetails", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ClaimNonReceiptV03";
				definition = "Scope\r\nThe Claim Non Receipt message is sent by a case creator/case assigner to a case assignee.\r\nThis message is used to initiate an investigation for missing funds at the creditor (missing credit entry to its account) or at an agent along the processing chain (missing cover for a received payment instruction).\r\nUsage\r\nThe claim non receipt case occurs in two situations:\r\n- The creditor is expecting funds from a particular debtor and cannot find the corresponding credit entry on its account. In this situation, it is understood that the creditor will contact its debtor, and that the debtor will trigger the claim non receipt case on its behalf. A workflow where the creditor directly addresses a Claim Non Receipt message to its account servicing institution is not retained.\r\n- An agent in the processing chain cannot find a cover payment corresponding to a received payment instruction. In this situation, the agent may directly trigger the investigation by sending a Claim Non Receipt message to the sender of the original payment instruction.\r\nThe Claim Non Receipt message covers one and only one payment instruction at a time. If several expected payment instructions/cover instructions are found missing, then multiple Claim Non Receipt messages must be sent.\r\nDepending on the result of the investigation by a case assignee (incorrect routing, errors/omissions when processing the instruction or even the absence of an error) and the stage at which the payment instruction is being process, the claim non receipt case may lead to a:\r\n- Request To Cancel Payment message, sent to the subsequent agent in the payment processing chain, if the original payment instruction has been incorrectly routed through the chain of agents. (This also implies that a new, corrected, payment instruction is issued).\r\n- Request To Modify Payment message, sent to the subsequent agent in the payment processing chain, if a truncation or omission has occurred during the processing of the original payment instruction.\r\nIf the above situations occur, the assignee wanting to request a payment cancellation or payment modification should first send out a Resolution Of Investigation with a confirmation status that indicates that either cancellation (CWFW) modification (MWFW) or unable to apply (UWFW) will follow. (See section on Resolution Of Investigation for more details).\r\nIn the cover is missing, the case assignee may also simply issue the omitted cover payment or when the initial cover information was incorrect, update the cover (through modification and/or cancellation as required) with the correction information provided in the ClaimNonReceipt message. The case assignee will issue a Resolution Of Investigation message with the CorrectionTransaction element mentioning the references of the cover payment.\r\nThe Claim Non Receipt message may be forwarded to subsequent case assignees.";
				nextVersions_lazy = () -> Arrays.asList(ClaimNonReceiptV04.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "ClmNonRct";
				businessArea_lazy = () -> CashManagementArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.camt.ClaimNonReceiptV03.mmAssignment, com.tools20022.repository.area.camt.ClaimNonReceiptV03.mmCase,
						com.tools20022.repository.area.camt.ClaimNonReceiptV03.mmUnderlying, com.tools20022.repository.area.camt.ClaimNonReceiptV03.mmCoverDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "camt";
						messageFunctionality = "027";
						version = "03";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return ClaimNonReceiptV03.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Assgnmt", required = true)
	public CaseAssignment2 getAssignment() {
		return assignment;
	}

	public void setAssignment(CaseAssignment2 assignment) {
		this.assignment = assignment;
	}

	@XmlElement(name = "Case", required = true)
	public Case2 getCase() {
		return case_;
	}

	public void setCase(Case2 case_) {
		this.case_ = case_;
	}

	@XmlElement(name = "Undrlyg", required = true)
	public UnderlyingTransaction1Choice getUnderlying() {
		return underlying;
	}

	public void setUnderlying(UnderlyingTransaction1Choice underlying) {
		this.underlying = underlying;
	}

	@XmlElement(name = "CoverDtls")
	public MissingCover2 getCoverDetails() {
		return coverDetails;
	}

	public void setCoverDetails(MissingCover2 coverDetails) {
		this.coverDetails = coverDetails;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:camt.027.03.03")
	static public class Document {
		@XmlElement(name = "ClmNonRct", required = true)
		public ClaimNonReceiptV03 messageBody;
	}
}