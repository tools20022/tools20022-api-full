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

package com.tools20022.repository.area.acmt;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.AccountManagementLatestVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.BankAccountManagementISOLatestversion;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * The AccountMandateMaintenanceAmendmentRequest message is sent from an
 * organisation to a financial institution as part of the account maintenance
 * process. It is sent in response to a request from the financial institution
 * to send additional information. Usage: this update is only about mandate
 * information. <br>
 * If modification codes are not used: the organisation will specify under the
 * “Mandate” and “Group” tags the complete information as it should be in the
 * financial institution’s records after processing the update request. <br>
 * If modification codes are used (in that case, they must be used everywhere):
 * the organisation will specify under the “Mandate” and “Group” tags which
 * elements must be added, deleted, modified, or if they are unchanged.<br>
 * It is not possible to update the account characteristics or organisation
 * information with this message.<br>
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.018.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementLatestVersion
 * AccountManagementLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmReferences
 * AccountMandateMaintenanceAmendmentRequestV02.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmFrom
 * AccountMandateMaintenanceAmendmentRequestV02.mmFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmContractDates
 * AccountMandateMaintenanceAmendmentRequestV02.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmUnderlyingMasterAgreement
 * AccountMandateMaintenanceAmendmentRequestV02.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmAccountIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmAccountServicerIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.mmAccountServicerIdentification}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmOrganisationIdentification
 * AccountMandateMaintenanceAmendmentRequestV02.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmMandate
 * AccountMandateMaintenanceAmendmentRequestV02.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmGroup
 * AccountMandateMaintenanceAmendmentRequestV02.mmGroup}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmDigitalSignature
 * AccountMandateMaintenanceAmendmentRequestV02.mmDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02#mmSupplementaryData
 * AccountMandateMaintenanceAmendmentRequestV02.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOLatestversion
 * BankAccountManagementISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctMndtMntncAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountMandateMaintenanceAmendmentRequestV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "The AccountMandateMaintenanceAmendmentRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is sent in response to a request from the financial institution to send additional information. Usage: this update is only about mandate information. \r\nIf modification codes are not used: the organisation will specify under the “Mandate” and “Group” tags the complete information as it should be in the financial institution’s records after processing the update request. \r\nIf modification codes are used (in that case, they must be used everywhere): the organisation will specify under the “Mandate” and “Group” tags which elements must be added, deleted, modified, or if they are unchanged.\r\nIt is not possible to update the account characteristics or organisation information with this message.\r\n"
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV01
 * AccountMandateMaintenanceAmendmentRequestV01}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountMandateMaintenanceAmendmentRequestV02", propOrder = {"references", "from", "contractDates", "underlyingMasterAgreement", "accountIdentification", "accountServicerIdentification", "organisationIdentification",
		"mandate", "group", "digitalSignature", "supplementaryData"})
public class AccountMandateMaintenanceAmendmentRequestV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Refs", required = true)
	protected References4 references;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.References4
	 * References4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Refs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, References4> mmReferences = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, References4>() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References4.mmObject();
		}

		@Override
		public References4 getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, References4 value) {
			obj.setReferences(value);
		}
	};
	@XmlElement(name = "Fr")
	protected OrganisationIdentification8 from;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Fr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "From"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<OrganisationIdentification8>> mmFrom = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<OrganisationIdentification8>>() {
		{
			xmlTag = "Fr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "From";
			definition = "Identifies the business sender of the message, if it is not the account owner or account servicing financial institution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		@Override
		public Optional<OrganisationIdentification8> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getFrom();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, Optional<OrganisationIdentification8> value) {
			obj.setFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract2 contractDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract2
	 * AccountContract2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctDts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target dates."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<AccountContract2>> mmContractDates = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<AccountContract2>>() {
		{
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target dates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountContract2.mmObject();
		}

		@Override
		public Optional<AccountContract2> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getContractDates();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, Optional<AccountContract2> value) {
			obj.setContractDates(value.orElse(null));
		}
	};
	@XmlElement(name = "UndrlygMstrAgrmt")
	protected ContractDocument1 underlyingMasterAgreement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ContractDocument1
	 * ContractDocument1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UndrlygMstrAgrmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<ContractDocument1>> mmUnderlyingMasterAgreement = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, Optional<ContractDocument1>>() {
		{
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the group to which the organisation belongs, and the account servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContractDocument1.mmObject();
		}

		@Override
		public Optional<ContractDocument1> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getUnderlyingMasterAgreement();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, Optional<ContractDocument1> value) {
			obj.setUnderlyingMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected List<AccountForAction1> accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountForAction1
	 * AccountForAction1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<AccountForAction1>> mmAccountIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<AccountForAction1>>() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			minOccurs = 1;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		@Override
		public List<AccountForAction1> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, List<AccountForAction1> value) {
			obj.setAccountIdentification(value);
		}
	};
	@XmlElement(name = "AcctSvcrId", required = true)
	protected BranchAndFinancialInstitutionIdentification5 accountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification5
	 * BranchAndFinancialInstitutionIdentification5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, BranchAndFinancialInstitutionIdentification5> mmAccountServicerIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, BranchAndFinancialInstitutionIdentification5>() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification5.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification5 getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, BranchAndFinancialInstitutionIdentification5 value) {
			obj.setAccountServicerIdentification(value);
		}
	};
	@XmlElement(name = "OrgId", required = true)
	protected OrganisationIdentification8 organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification8
	 * OrganisationIdentification8}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the organisation requesting the change."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, OrganisationIdentification8> mmOrganisationIdentification = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, OrganisationIdentification8>() {
		{
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification of the organisation requesting the change.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> OrganisationIdentification8.mmObject();
		}

		@Override
		public OrganisationIdentification8 getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getOrganisationIdentification();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, OrganisationIdentification8 value) {
			obj.setOrganisationIdentification(value);
		}
	};
	@XmlElement(name = "Mndt")
	protected List<OperationMandate3> mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate3
	 * OperationMandate3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specifying the account mandate."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<OperationMandate3>> mmMandate = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<OperationMandate3>>() {
		{
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 0;
			complexType_lazy = () -> OperationMandate3.mmObject();
		}

		@Override
		public List<OperationMandate3> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, List<OperationMandate3> value) {
			obj.setMandate(value);
		}
	};
	@XmlElement(name = "Grp")
	protected List<Group2> group;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Group2 Group2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Grp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Group"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of a group of parties."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<Group2>> mmGroup = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<Group2>>() {
		{
			xmlTag = "Grp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Group";
			definition = "Definition of a group of parties.";
			minOccurs = 0;
			complexType_lazy = () -> Group2.mmObject();
		}

		@Override
		public List<Group2> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getGroup();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, List<Group2> value) {
			obj.setGroup(value);
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature2> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature2
	 * PartyAndSignature2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<PartyAndSignature2>> mmDigitalSignature = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<PartyAndSignature2>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature2.mmObject();
		}

		@Override
		public List<PartyAndSignature2> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, List<PartyAndSignature2> value) {
			obj.setDigitalSignature(value);
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<AccountMandateMaintenanceAmendmentRequestV02, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(AccountMandateMaintenanceAmendmentRequestV02 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(AccountMandateMaintenanceAmendmentRequestV02 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountMandateMaintenanceAmendmentRequestV02";
				definition = "The AccountMandateMaintenanceAmendmentRequest message is sent from an organisation to a financial institution as part of the account maintenance process. It is sent in response to a request from the financial institution to send additional information. Usage: this update is only about mandate information. \r\nIf modification codes are not used: the organisation will specify under the “Mandate” and “Group” tags the complete information as it should be in the financial institution’s records after processing the update request. \r\nIf modification codes are used (in that case, they must be used everywhere): the organisation will specify under the “Mandate” and “Group” tags which elements must be added, deleted, modified, or if they are unchanged.\r\nIt is not possible to update the account characteristics or organisation information with this message.\r\n";
				previousVersion_lazy = () -> AccountMandateMaintenanceAmendmentRequestV01.mmObject();
				messageSet_lazy = () -> Arrays.asList(BankAccountManagementISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "AcctMndtMntncAmdmntReq";
				businessArea_lazy = () -> AccountManagementLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmReferences,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmFrom, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmContractDates,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmUnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmAccountIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmAccountServicerIdentification,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmOrganisationIdentification, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmMandate,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmGroup, com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmDigitalSignature,
						com.tools20022.repository.area.acmt.AccountMandateMaintenanceAmendmentRequestV02.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "018";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountMandateMaintenanceAmendmentRequestV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References4 getReferences() {
		return references;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setReferences(References4 references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<OrganisationIdentification8> getFrom() {
		return from == null ? Optional.empty() : Optional.of(from);
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setFrom(OrganisationIdentification8 from) {
		this.from = from;
		return this;
	}

	public Optional<AccountContract2> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setContractDates(AccountContract2 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setUnderlyingMasterAgreement(ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public List<AccountForAction1> getAccountIdentification() {
		return accountIdentification == null ? accountIdentification = new ArrayList<>() : accountIdentification;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setAccountIdentification(List<AccountForAction1> accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification5 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification5 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public OrganisationIdentification8 getOrganisationIdentification() {
		return organisationIdentification;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setOrganisationIdentification(OrganisationIdentification8 organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public List<OperationMandate3> getMandate() {
		return mandate == null ? mandate = new ArrayList<>() : mandate;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setMandate(List<OperationMandate3> mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public List<Group2> getGroup() {
		return group == null ? group = new ArrayList<>() : group;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setGroup(List<Group2> group) {
		this.group = Objects.requireNonNull(group);
		return this;
	}

	public List<PartyAndSignature2> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setDigitalSignature(List<PartyAndSignature2> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public AccountMandateMaintenanceAmendmentRequestV02 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.018.001.02")
	static public class Document {
		@XmlElement(name = "AcctMndtMntncAmdmntReq", required = true)
		public AccountMandateMaintenanceAmendmentRequestV02 messageBody;
	}
}