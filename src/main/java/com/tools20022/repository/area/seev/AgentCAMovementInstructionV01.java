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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * This message is sent by an issuer (or its agent) to a CSD to order:<br>
 * - the global or individual debit of exercised resources (cash and/or
 * securities), per event and optionally per option and per resource for all or
 * individual CSD client's accounts;<br>
 * - and/or the individual credits of the outturn resources per event and
 * optionally per option and per resource for a given CSD client's account.<br>
 * <b>Usage</b><br>
 * This message is used to instruct:<br>
 * - the global debit of the exercised resources from the CSD client's available
 * or sequestered balance, in which case, the order type must be 'global debit
 * order';<br>
 * - the individual debits and credits:<br>
 * - the individual debit of the exercised resources from the CSD client's
 * available or sequestered balance and/or<br>
 * - the individual credit of the outturn resources to the CSD client's account.<br>
 * The order type must be 'individual order';<br>
 * - a return order, in the case of a scaleback, i.e. the return of the
 * exercised resources to the CSD client's account. The order type must be
 * either 'global return order' or 'individual return order'; and<br>
 * change of option, e.g. in the case of the closure of an option, by moving the
 * exercised resources from one option to another option within the sequestered
 * balances in accordance to the new option conditions. The order type must be
 * 'option change order'.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmIdentification
 * AgentCAMovementInstructionV01.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmAgentCAElectionAdviceIdentification
 * AgentCAMovementInstructionV01.mmAgentCAElectionAdviceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmCorporateActionGeneralInformation
 * AgentCAMovementInstructionV01.mmCorporateActionGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmMovementGeneralInformation
 * AgentCAMovementInstructionV01.mmMovementGeneralInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmUnderlyingSecuritiesMovementDetails
 * AgentCAMovementInstructionV01.mmUnderlyingSecuritiesMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmUnderlyingCashMovementDetails
 * AgentCAMovementInstructionV01.mmUnderlyingCashMovementDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.AgentCAMovementInstructionV01#mmProceedsMovementDetails
 * AgentCAMovementInstructionV01.mmProceedsMovementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.IssuersAgentsCommunicationISOLatestversion
 * IssuersAgentsCommunicationISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AgtCAMvmntInstr"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.019.001.01}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionRule1#for_seev_AgentCAMovementInstructionV01
 * ConstraintOptionRule1.for_seev_AgentCAMovementInstructionV01}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOptionRule2#for_seev_AgentCAMovementInstructionV01
 * ConstraintOptionRule2.for_seev_AgentCAMovementInstructionV01}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AgentCAMovementInstructionV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to order:\r\n- the global or individual debit of exercised resources (cash and/or securities), per event and optionally per option and per resource for all or individual CSD client's accounts;\r\n- and/or the individual credits of the outturn resources per event and optionally per option and per resource for a given CSD client's account.\r\nUsage\r\nThis message is used to instruct:\r\n- the global debit of the exercised resources from the CSD client's available or sequestered balance, in which case, the order type must be 'global debit order';\r\n- the individual debits and credits:\r\n- the individual debit of the exercised resources from the CSD client's available or sequestered balance and/or\r\n- the individual credit of the outturn resources to the CSD client's account.\r\nThe order type must be 'individual order';\r\n- a return order, in the case of a scaleback, i.e. the return of the exercised resources to the CSD client's account. The order type must be either 'global return order' or 'individual return order'; and\r\nchange of option, e.g. in the case of the closure of an option, by moving the exercised resources from one option to another option within the sequestered balances in accordance to the new option conditions. The order type must be 'option change order'."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AgentCAMovementInstructionV01", propOrder = {"identification", "agentCAElectionAdviceIdentification", "corporateActionGeneralInformation", "movementGeneralInformation", "underlyingSecuritiesMovementDetails",
		"underlyingCashMovementDetails", "proceedsMovementDetails"})
public class AgentCAMovementInstructionV01 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected DocumentIdentification8 identification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the Sender to unambiguously identify the instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, DocumentIdentification8> mmIdentification = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, DocumentIdentification8>() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identification assigned by the Sender to unambiguously identify the instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public DocumentIdentification8 getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getIdentification();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, DocumentIdentification8 value) {
			obj.setIdentification(value);
		}
	};
	@XmlElement(name = "AgtCAElctnAdvcId")
	protected DocumentIdentification8 agentCAElectionAdviceIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.DocumentIdentification8
	 * DocumentIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AgtCAElctnAdvcId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AgentCAElectionAdviceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the Agent CA ElectionAdvice when the movements are the result of an ElectionAdvice."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, Optional<DocumentIdentification8>> mmAgentCAElectionAdviceIdentification = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, Optional<DocumentIdentification8>>() {
		{
			xmlTag = "AgtCAElctnAdvcId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AgentCAElectionAdviceIdentification";
			definition = "Identification of the Agent CA ElectionAdvice when the movements are the result of an ElectionAdvice.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DocumentIdentification8.mmObject();
		}

		@Override
		public Optional<DocumentIdentification8> getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getAgentCAElectionAdviceIdentification();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, Optional<DocumentIdentification8> value) {
			obj.setAgentCAElectionAdviceIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "CorpActnGnlInf", required = true)
	protected CorporateActionInformation1 corporateActionGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionInformation1
	 * CorporateActionInformation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "General information about the corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, CorporateActionInformation1> mmCorporateActionGeneralInformation = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, CorporateActionInformation1>() {
		{
			xmlTag = "CorpActnGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionGeneralInformation";
			definition = "General information about the corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionInformation1.mmObject();
		}

		@Override
		public CorporateActionInformation1 getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getCorporateActionGeneralInformation();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, CorporateActionInformation1 value) {
			obj.setCorporateActionGeneralInformation(value);
		}
	};
	@XmlElement(name = "MvmntGnlInf", required = true)
	protected CorporateActionMovement1 movementGeneralInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionMovement1
	 * CorporateActionMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MvmntGnlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MovementGeneralInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides general information about the movement."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, CorporateActionMovement1> mmMovementGeneralInformation = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, CorporateActionMovement1>() {
		{
			xmlTag = "MvmntGnlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MovementGeneralInformation";
			definition = "Provides general information about the movement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CorporateActionMovement1.mmObject();
		}

		@Override
		public CorporateActionMovement1 getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getMovementGeneralInformation();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, CorporateActionMovement1 value) {
			obj.setMovementGeneralInformation(value);
		}
	};
	@XmlElement(name = "UndrlygSctiesMvmntDtls")
	protected List<UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.UnderlyingSecurityMovement1
	 * UnderlyingSecurityMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygSctiesMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingSecuritiesMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the movement of the underlying securities."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, List<UnderlyingSecurityMovement1>> mmUnderlyingSecuritiesMovementDetails = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, List<UnderlyingSecurityMovement1>>() {
		{
			xmlTag = "UndrlygSctiesMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingSecuritiesMovementDetails";
			definition = "Information related to the movement of the underlying securities.";
			minOccurs = 0;
			complexType_lazy = () -> UnderlyingSecurityMovement1.mmObject();
		}

		@Override
		public List<UnderlyingSecurityMovement1> getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getUnderlyingSecuritiesMovementDetails();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, List<UnderlyingSecurityMovement1> value) {
			obj.setUnderlyingSecuritiesMovementDetails(value);
		}
	};
	@XmlElement(name = "UndrlygCshMvmntDtls")
	protected List<CashMovement2> underlyingCashMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashMovement2
	 * CashMovement2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygCshMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingCashMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the movement of the underlying cash."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, List<CashMovement2>> mmUnderlyingCashMovementDetails = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, List<CashMovement2>>() {
		{
			xmlTag = "UndrlygCshMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingCashMovementDetails";
			definition = "Information related to the movement of the underlying cash.";
			minOccurs = 0;
			complexType_lazy = () -> CashMovement2.mmObject();
		}

		@Override
		public List<CashMovement2> getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getUnderlyingCashMovementDetails();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, List<CashMovement2> value) {
			obj.setUnderlyingCashMovementDetails(value);
		}
	};
	@XmlElement(name = "PrcdsMvmntDtls")
	protected ProceedsMovement1 proceedsMovementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProceedsMovement1
	 * ProceedsMovement1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcdsMvmntDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProceedsMovementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to the movement of the CA proceeds."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AgentCAMovementInstructionV01, Optional<ProceedsMovement1>> mmProceedsMovementDetails = new MMMessageBuildingBlock<AgentCAMovementInstructionV01, Optional<ProceedsMovement1>>() {
		{
			xmlTag = "PrcdsMvmntDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProceedsMovementDetails";
			definition = "Information related to the movement of the CA proceeds.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ProceedsMovement1.mmObject();
		}

		@Override
		public Optional<ProceedsMovement1> getValue(AgentCAMovementInstructionV01 obj) {
			return obj.getProceedsMovementDetails();
		}

		@Override
		public void setValue(AgentCAMovementInstructionV01 obj, Optional<ProceedsMovement1> value) {
			obj.setProceedsMovementDetails(value.orElse(null));
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOptionRule1.for_seev_AgentCAMovementInstructionV01,
						com.tools20022.repository.constraints.ConstraintOptionRule2.for_seev_AgentCAMovementInstructionV01);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AgentCAMovementInstructionV01";
				definition = "Scope\r\nThis message is sent by an issuer (or its agent) to a CSD to order:\r\n- the global or individual debit of exercised resources (cash and/or securities), per event and optionally per option and per resource for all or individual CSD client's accounts;\r\n- and/or the individual credits of the outturn resources per event and optionally per option and per resource for a given CSD client's account.\r\nUsage\r\nThis message is used to instruct:\r\n- the global debit of the exercised resources from the CSD client's available or sequestered balance, in which case, the order type must be 'global debit order';\r\n- the individual debits and credits:\r\n- the individual debit of the exercised resources from the CSD client's available or sequestered balance and/or\r\n- the individual credit of the outturn resources to the CSD client's account.\r\nThe order type must be 'individual order';\r\n- a return order, in the case of a scaleback, i.e. the return of the exercised resources to the CSD client's account. The order type must be either 'global return order' or 'individual return order'; and\r\nchange of option, e.g. in the case of the closure of an option, by moving the exercised resources from one option to another option within the sequestered balances in accordance to the new option conditions. The order type must be 'option change order'.";
				messageSet_lazy = () -> Arrays.asList(IssuersAgentsCommunicationISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AgtCAMvmntInstr";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmIdentification,
						com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmAgentCAElectionAdviceIdentification, com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmCorporateActionGeneralInformation,
						com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmMovementGeneralInformation, com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmUnderlyingSecuritiesMovementDetails,
						com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmUnderlyingCashMovementDetails, com.tools20022.repository.area.seev.AgentCAMovementInstructionV01.mmProceedsMovementDetails);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "019";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AgentCAMovementInstructionV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public DocumentIdentification8 getIdentification() {
		return identification;
	}

	public AgentCAMovementInstructionV01 setIdentification(DocumentIdentification8 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<DocumentIdentification8> getAgentCAElectionAdviceIdentification() {
		return agentCAElectionAdviceIdentification == null ? Optional.empty() : Optional.of(agentCAElectionAdviceIdentification);
	}

	public AgentCAMovementInstructionV01 setAgentCAElectionAdviceIdentification(DocumentIdentification8 agentCAElectionAdviceIdentification) {
		this.agentCAElectionAdviceIdentification = agentCAElectionAdviceIdentification;
		return this;
	}

	public CorporateActionInformation1 getCorporateActionGeneralInformation() {
		return corporateActionGeneralInformation;
	}

	public AgentCAMovementInstructionV01 setCorporateActionGeneralInformation(CorporateActionInformation1 corporateActionGeneralInformation) {
		this.corporateActionGeneralInformation = Objects.requireNonNull(corporateActionGeneralInformation);
		return this;
	}

	public CorporateActionMovement1 getMovementGeneralInformation() {
		return movementGeneralInformation;
	}

	public AgentCAMovementInstructionV01 setMovementGeneralInformation(CorporateActionMovement1 movementGeneralInformation) {
		this.movementGeneralInformation = Objects.requireNonNull(movementGeneralInformation);
		return this;
	}

	public List<UnderlyingSecurityMovement1> getUnderlyingSecuritiesMovementDetails() {
		return underlyingSecuritiesMovementDetails == null ? underlyingSecuritiesMovementDetails = new ArrayList<>() : underlyingSecuritiesMovementDetails;
	}

	public AgentCAMovementInstructionV01 setUnderlyingSecuritiesMovementDetails(List<UnderlyingSecurityMovement1> underlyingSecuritiesMovementDetails) {
		this.underlyingSecuritiesMovementDetails = Objects.requireNonNull(underlyingSecuritiesMovementDetails);
		return this;
	}

	public List<CashMovement2> getUnderlyingCashMovementDetails() {
		return underlyingCashMovementDetails == null ? underlyingCashMovementDetails = new ArrayList<>() : underlyingCashMovementDetails;
	}

	public AgentCAMovementInstructionV01 setUnderlyingCashMovementDetails(List<CashMovement2> underlyingCashMovementDetails) {
		this.underlyingCashMovementDetails = Objects.requireNonNull(underlyingCashMovementDetails);
		return this;
	}

	public Optional<ProceedsMovement1> getProceedsMovementDetails() {
		return proceedsMovementDetails == null ? Optional.empty() : Optional.of(proceedsMovementDetails);
	}

	public AgentCAMovementInstructionV01 setProceedsMovementDetails(ProceedsMovement1 proceedsMovementDetails) {
		this.proceedsMovementDetails = proceedsMovementDetails;
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.019.001.01")
	static public class Document {
		@XmlElement(name = "AgtCAMvmntInstr", required = true)
		public AgentCAMovementInstructionV01 messageBody;
	}
}