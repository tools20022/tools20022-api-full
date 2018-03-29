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
import com.tools20022.repository.area.AccountManagementPreviousVersion;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.BankAccountManagementISOPreviousversion;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AccountOpeningAmendmentRequest message is sent from an organisation to a
 * financial institution as part of the account opening process. It is sent in
 * response to a request from the financial institution to provide additional
 * information.<br>
 * <b>Usage</b><br>
 * This message should only be sent if additional information is requested as
 * part of the account opening process.<br>
 * It could be sent together with other related documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmReferences
 * AccountOpeningAmendmentRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmContractDates
 * AccountOpeningAmendmentRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmUnderlyingMasterAgreement
 * AccountOpeningAmendmentRequestV01.mmUnderlyingMasterAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmAccount
 * AccountOpeningAmendmentRequestV01.mmAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmAccountServicerIdentification
 * AccountOpeningAmendmentRequestV01.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmOrganisation
 * AccountOpeningAmendmentRequestV01.mmOrganisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmMandate
 * AccountOpeningAmendmentRequestV01.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmReferenceAccount
 * AccountOpeningAmendmentRequestV01.mmReferenceAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01#mmDigitalSignature
 * AccountOpeningAmendmentRequestV01.mmDigitalSignature}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.BankAccountManagementISOPreviousversion
 * BankAccountManagementISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "AcctOpngAmdmntReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.008.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountOpeningAmendmentRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AccountOpeningAmendmentRequest message is sent from an organisation to a financial institution as part of the account opening process. It is sent in response to a request from the financial institution to provide additional information.\r\nUsage\r\nThis message should only be sent if additional information is requested as part of the account opening process.\r\nIt could be sent together with other related documents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV02
 * AccountOpeningAmendmentRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountOpeningAmendmentRequestV01", propOrder = {"references", "contractDates", "underlyingMasterAgreement", "account", "accountServicerIdentification", "organisation", "mandate", "referenceAccount", "digitalSignature"})
public class AccountOpeningAmendmentRequestV01 {

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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "References"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements for the identification of the message and related references."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, References4> mmReferences = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, References4>() {
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
		public References4 getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getReferences();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, References4 value) {
			obj.setReferences(value);
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractDates"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies target dates."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<AccountContract2>> mmContractDates = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<AccountContract2>>() {
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
		public Optional<AccountContract2> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getContractDates();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, Optional<AccountContract2> value) {
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnderlyingMasterAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Account contract established between the organisation or the Group to which the organisation belongs, and the account Servicer. This contract has to be applied for the new account to be opened and maintained."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<ContractDocument1>> mmUnderlyingMasterAgreement = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<ContractDocument1>>() {
		{
			xmlTag = "UndrlygMstrAgrmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnderlyingMasterAgreement";
			definition = "Account contract established between the organisation or the Group to which the organisation belongs, and the account Servicer. This contract has to be applied for the new account to be opened and maintained.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> ContractDocument1.mmObject();
		}

		@Override
		public Optional<ContractDocument1> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getUnderlyingMasterAgreement();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, Optional<ContractDocument1> value) {
			obj.setUnderlyingMasterAgreement(value.orElse(null));
		}
	};
	@XmlElement(name = "Acct", required = true)
	protected CustomerAccount1 account;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CustomerAccount1
	 * CustomerAccount1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Acct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Account"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, CustomerAccount1> mmAccount = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, CustomerAccount1>() {
		{
			xmlTag = "Acct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Account";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> CustomerAccount1.mmObject();
		}

		@Override
		public CustomerAccount1 getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getAccount();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, CustomerAccount1 value) {
			obj.setAccount(value);
		}
	};
	@XmlElement(name = "AcctSvcrId", required = true)
	protected BranchAndFinancialInstitutionIdentification4 accountServicerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.BranchAndFinancialInstitutionIdentification4
	 * BranchAndFinancialInstitutionIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, BranchAndFinancialInstitutionIdentification4> mmAccountServicerIdentification = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, BranchAndFinancialInstitutionIdentification4>() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme. \n.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		@Override
		public BranchAndFinancialInstitutionIdentification4 getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getAccountServicerIdentification();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, BranchAndFinancialInstitutionIdentification4 value) {
			obj.setAccountServicerIdentification(value);
		}
	};
	@XmlElement(name = "Org", required = true)
	protected List<Organisation6> organisation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Organisation6
	 * Organisation6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Org"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Organisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<Organisation6>> mmOrganisation = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<Organisation6>>() {
		{
			xmlTag = "Org";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Organisation";
			definition = "Organised structure that is set up for a particular purpose, for example, a business, government body, department, charity, or financial institution.";
			minOccurs = 1;
			complexType_lazy = () -> Organisation6.mmObject();
		}

		@Override
		public List<Organisation6> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getOrganisation();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, List<Organisation6> value) {
			obj.setOrganisation(value);
		}
	};
	@XmlElement(name = "Mndt")
	protected List<OperationMandate1> mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OperationMandate1
	 * OperationMandate1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specifying the account mandate."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<OperationMandate1>> mmMandate = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<OperationMandate1>>() {
		{
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Information specifying the account mandate.";
			minOccurs = 0;
			complexType_lazy = () -> OperationMandate1.mmObject();
		}

		@Override
		public List<OperationMandate1> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, List<OperationMandate1> value) {
			obj.setMandate(value);
		}
	};
	@XmlElement(name = "RefAcct")
	protected CashAccount16 referenceAccount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.CashAccount16
	 * CashAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RefAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReferenceAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account used as a reference for the opening of another account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<CashAccount16>> mmReferenceAccount = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, Optional<CashAccount16>>() {
		{
			xmlTag = "RefAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReferenceAccount";
			definition = "Unique and unambiguous identification of the account used as a reference for the opening of another account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CashAccount16.mmObject();
		}

		@Override
		public Optional<CashAccount16> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getReferenceAccount();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, Optional<CashAccount16> value) {
			obj.setReferenceAccount(value.orElse(null));
		}
	};
	@XmlElement(name = "DgtlSgntr")
	protected List<PartyAndSignature1> digitalSignature;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyAndSignature1
	 * PartyAndSignature1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contains the signature with its components, namely signed info, signature value, key info and the object."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<PartyAndSignature1>> mmDigitalSignature = new MMMessageBuildingBlock<AccountOpeningAmendmentRequestV01, List<PartyAndSignature1>>() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature1.mmObject();
		}

		@Override
		public List<PartyAndSignature1> getValue(AccountOpeningAmendmentRequestV01 obj) {
			return obj.getDigitalSignature();
		}

		@Override
		public void setValue(AccountOpeningAmendmentRequestV01 obj, List<PartyAndSignature1> value) {
			obj.setDigitalSignature(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountOpeningAmendmentRequestV01";
				definition = "Scope\r\nThe AccountOpeningAmendmentRequest message is sent from an organisation to a financial institution as part of the account opening process. It is sent in response to a request from the financial institution to provide additional information.\r\nUsage\r\nThis message should only be sent if additional information is requested as part of the account opening process.\r\nIt could be sent together with other related documents.";
				nextVersions_lazy = () -> Arrays.asList(AccountOpeningAmendmentRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(BankAccountManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctOpngAmdmntReq";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmReferences, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmContractDates,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmUnderlyingMasterAgreement, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmAccount,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmOrganisation,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmMandate, com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmReferenceAccount,
						com.tools20022.repository.area.acmt.AccountOpeningAmendmentRequestV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "008";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountOpeningAmendmentRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References4 getReferences() {
		return references;
	}

	public AccountOpeningAmendmentRequestV01 setReferences(References4 references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public Optional<AccountContract2> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountOpeningAmendmentRequestV01 setContractDates(AccountContract2 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public Optional<ContractDocument1> getUnderlyingMasterAgreement() {
		return underlyingMasterAgreement == null ? Optional.empty() : Optional.of(underlyingMasterAgreement);
	}

	public AccountOpeningAmendmentRequestV01 setUnderlyingMasterAgreement(ContractDocument1 underlyingMasterAgreement) {
		this.underlyingMasterAgreement = underlyingMasterAgreement;
		return this;
	}

	public CustomerAccount1 getAccount() {
		return account;
	}

	public AccountOpeningAmendmentRequestV01 setAccount(CustomerAccount1 account) {
		this.account = Objects.requireNonNull(account);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public AccountOpeningAmendmentRequestV01 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public List<Organisation6> getOrganisation() {
		return organisation == null ? organisation = new ArrayList<>() : organisation;
	}

	public AccountOpeningAmendmentRequestV01 setOrganisation(List<Organisation6> organisation) {
		this.organisation = Objects.requireNonNull(organisation);
		return this;
	}

	public List<OperationMandate1> getMandate() {
		return mandate == null ? mandate = new ArrayList<>() : mandate;
	}

	public AccountOpeningAmendmentRequestV01 setMandate(List<OperationMandate1> mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public Optional<CashAccount16> getReferenceAccount() {
		return referenceAccount == null ? Optional.empty() : Optional.of(referenceAccount);
	}

	public AccountOpeningAmendmentRequestV01 setReferenceAccount(CashAccount16 referenceAccount) {
		this.referenceAccount = referenceAccount;
		return this;
	}

	public List<PartyAndSignature1> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public AccountOpeningAmendmentRequestV01 setDigitalSignature(List<PartyAndSignature1> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.008.001.01")
	static public class Document {
		@XmlElement(name = "AcctOpngAmdmntReq", required = true)
		public AccountOpeningAmendmentRequestV01 messageBody;
	}
}