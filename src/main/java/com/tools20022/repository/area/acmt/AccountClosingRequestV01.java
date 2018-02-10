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
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The AccountClosingRequest message is sent from an organisation to a financial
 * institution as part of the account closing process. It is the initial request
 * message to close an account.<br>
 * <b>Usage</b><br>
 * This message is the initial request message to close an account.<br>
 * It could be sent together with other related documents.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmReferences
 * AccountClosingRequestV01.mmReferences}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmAccountIdentification
 * AccountClosingRequestV01.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmAccountServicerIdentification
 * AccountClosingRequestV01.mmAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmOrganisationIdentification
 * AccountClosingRequestV01.mmOrganisationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmContractDates
 * AccountClosingRequestV01.mmContractDates}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmBalanceTransferAccount
 * AccountClosingRequestV01.mmBalanceTransferAccount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmTransferAccountServicerIdentification
 * AccountClosingRequestV01.mmTransferAccountServicerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV01#mmDigitalSignature
 * AccountClosingRequestV01.mmDigitalSignature}</li>
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
 * xmlTag} = "AcctClsgReq"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.AccountManagementPreviousVersion
 * AccountManagementPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code acmt.019.001.01}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AccountClosingRequestV01"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe AccountClosingRequest message is sent from an organisation to a financial institution as part of the account closing process. It is the initial request message to close an account.\r\nUsage\r\nThis message is the initial request message to close an account.\r\nIt could be sent together with other related documents."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.area.acmt.AccountClosingRequestV02
 * AccountClosingRequestV02}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AccountClosingRequestV01", propOrder = {"references", "accountIdentification", "accountServicerIdentification", "organisationIdentification", "contractDates", "balanceTransferAccount",
		"transferAccountServicerIdentification", "digitalSignature"})
public class AccountClosingRequestV01 {

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
	public static final MMMessageBuildingBlock mmReferences = new MMMessageBuildingBlock() {
		{
			xmlTag = "Refs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "References";
			definition = "Set of elements for the identification of the message and related references.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> References4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getReferences", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AcctId", required = true)
	protected AccountForAction1 accountIdentification;
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification of the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification of the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getAccountIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAccountServicerIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "AcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getAccountServicerIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "OrgId", required = true)
	protected List<OrganisationIdentification6> organisationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.OrganisationIdentification6
	 * OrganisationIdentification6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrganisationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the organisation requesting the change."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmOrganisationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "OrgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrganisationIdentification";
			definition = "Identification of the organisation requesting the change.";
			minOccurs = 1;
			complexType_lazy = () -> OrganisationIdentification6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getOrganisationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "CtrctDts")
	protected AccountContract4 contractDates;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AccountContract4
	 * AccountContract4}</li>
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
	public static final MMMessageBuildingBlock mmContractDates = new MMMessageBuildingBlock() {
		{
			xmlTag = "CtrctDts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractDates";
			definition = "Specifies target dates.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountContract4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getContractDates", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "BalTrfAcct")
	protected AccountForAction1 balanceTransferAccount;
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
	 * xmlTag} = "BalTrfAcct"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BalanceTransferAccount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the account to which the remaining positive balance of the account to be closed must be transferred or account from which funds can be moved to the account to be closed and which balance is negative. This account must be held in the same financial institution as the account to be closed if the transfer account is used to compensate a negative balance. For a positive balance to be transferred, an account in another financial institution might be used. In that case the account servicer is mandatory."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmBalanceTransferAccount = new MMMessageBuildingBlock() {
		{
			xmlTag = "BalTrfAcct";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BalanceTransferAccount";
			definition = "Identification of the account to which the remaining positive balance of the account to be closed must be transferred or account from which funds can be moved to the account to be closed and which balance is negative. This account must be held in the same financial institution as the account to be closed if the transfer account is used to compensate a negative balance. For a positive balance to be transferred, an account in another financial institution might be used. In that case the account servicer is mandatory.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AccountForAction1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getBalanceTransferAccount", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "TrfAcctSvcrId")
	protected BranchAndFinancialInstitutionIdentification4 transferAccountServicerIdentification;
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
	 * xmlTag} = "TrfAcctSvcrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferAccountServicerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme, that is the servicer of the transfer account."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmTransferAccountServicerIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "TrfAcctSvcrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferAccountServicerIdentification";
			definition = "Unique and unambiguous identifier of a financial institution, as assigned under an internationally recognised or proprietary identification scheme, that is the servicer of the transfer account.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BranchAndFinancialInstitutionIdentification4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getTransferAccountServicerIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
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
	public static final MMMessageBuildingBlock mmDigitalSignature = new MMMessageBuildingBlock() {
		{
			xmlTag = "DgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalSignature";
			definition = "Contains the signature with its components, namely signed info, signature value, key info and the object.";
			minOccurs = 0;
			complexType_lazy = () -> PartyAndSignature1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return AccountClosingRequestV01.class.getMethod("getDigitalSignature", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AccountClosingRequestV01";
				definition = "Scope\r\nThe AccountClosingRequest message is sent from an organisation to a financial institution as part of the account closing process. It is the initial request message to close an account.\r\nUsage\r\nThis message is the initial request message to close an account.\r\nIt could be sent together with other related documents.";
				nextVersions_lazy = () -> Arrays.asList(AccountClosingRequestV02.mmObject());
				messageSet_lazy = () -> Arrays.asList(BankAccountManagementISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "AcctClsgReq";
				businessArea_lazy = () -> AccountManagementPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmReferences, com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmAccountIdentification,
						com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmOrganisationIdentification,
						com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmContractDates, com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmBalanceTransferAccount,
						com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmTransferAccountServicerIdentification, com.tools20022.repository.area.acmt.AccountClosingRequestV01.mmDigitalSignature);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "acmt";
						messageFunctionality = "019";
						version = "01";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return AccountClosingRequestV01.class;
			}
		});
		return mmObject_lazy.get();
	}

	public References4 getReferences() {
		return references;
	}

	public AccountClosingRequestV01 setReferences(References4 references) {
		this.references = Objects.requireNonNull(references);
		return this;
	}

	public AccountForAction1 getAccountIdentification() {
		return accountIdentification;
	}

	public AccountClosingRequestV01 setAccountIdentification(AccountForAction1 accountIdentification) {
		this.accountIdentification = Objects.requireNonNull(accountIdentification);
		return this;
	}

	public BranchAndFinancialInstitutionIdentification4 getAccountServicerIdentification() {
		return accountServicerIdentification;
	}

	public AccountClosingRequestV01 setAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 accountServicerIdentification) {
		this.accountServicerIdentification = Objects.requireNonNull(accountServicerIdentification);
		return this;
	}

	public List<OrganisationIdentification6> getOrganisationIdentification() {
		return organisationIdentification == null ? organisationIdentification = new ArrayList<>() : organisationIdentification;
	}

	public AccountClosingRequestV01 setOrganisationIdentification(List<OrganisationIdentification6> organisationIdentification) {
		this.organisationIdentification = Objects.requireNonNull(organisationIdentification);
		return this;
	}

	public Optional<AccountContract4> getContractDates() {
		return contractDates == null ? Optional.empty() : Optional.of(contractDates);
	}

	public AccountClosingRequestV01 setContractDates(AccountContract4 contractDates) {
		this.contractDates = contractDates;
		return this;
	}

	public Optional<AccountForAction1> getBalanceTransferAccount() {
		return balanceTransferAccount == null ? Optional.empty() : Optional.of(balanceTransferAccount);
	}

	public AccountClosingRequestV01 setBalanceTransferAccount(AccountForAction1 balanceTransferAccount) {
		this.balanceTransferAccount = balanceTransferAccount;
		return this;
	}

	public Optional<BranchAndFinancialInstitutionIdentification4> getTransferAccountServicerIdentification() {
		return transferAccountServicerIdentification == null ? Optional.empty() : Optional.of(transferAccountServicerIdentification);
	}

	public AccountClosingRequestV01 setTransferAccountServicerIdentification(BranchAndFinancialInstitutionIdentification4 transferAccountServicerIdentification) {
		this.transferAccountServicerIdentification = transferAccountServicerIdentification;
		return this;
	}

	public List<PartyAndSignature1> getDigitalSignature() {
		return digitalSignature == null ? digitalSignature = new ArrayList<>() : digitalSignature;
	}

	public AccountClosingRequestV01 setDigitalSignature(List<PartyAndSignature1> digitalSignature) {
		this.digitalSignature = Objects.requireNonNull(digitalSignature);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:acmt.019.001.01")
	static public class Document {
		@XmlElement(name = "AcctClsgReq", required = true)
		public AccountClosingRequestV01 messageBody;
	}
}