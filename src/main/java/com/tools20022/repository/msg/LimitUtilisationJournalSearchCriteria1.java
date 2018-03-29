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

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.AccountIdentification4Choice;
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.codeset.LimitType4Code;
import com.tools20022.repository.datatype.BICFIIdentifier;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.SystemPartyIdentification4;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines the criteria used to search for a limit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmLimitType
 * LimitUtilisationJournalSearchCriteria1.mmLimitType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmJournalActivityDate
 * LimitUtilisationJournalSearchCriteria1.mmJournalActivityDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmAccountIdentification
 * LimitUtilisationJournalSearchCriteria1.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmLimitCurrency
 * LimitUtilisationJournalSearchCriteria1.mmLimitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmAccountOwner
 * LimitUtilisationJournalSearchCriteria1.mmAccountOwner}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1#mmBilateralLimitCounterpartyIdentification
 * LimitUtilisationJournalSearchCriteria1.
 * mmBilateralLimitCounterpartyIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RiskManagementLimit
 * RiskManagementLimit}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LimitUtilisationJournalSearchCriteria1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Defines the criteria used to search for a limit."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LimitUtilisationJournalSearchCriteria1", propOrder = {"limitType", "journalActivityDate", "accountIdentification", "limitCurrency", "accountOwner", "bilateralLimitCounterpartyIdentification"})
public class LimitUtilisationJournalSearchCriteria1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LmtTp")
	protected List<LimitType4Code> limitType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.LimitType4Code
	 * LimitType4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmType Limit.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of limit applied by the system at the present time."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, List<LimitType4Code>> mmLimitType = new MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, List<LimitType4Code>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitType";
			definition = "Type of limit applied by the system at the present time.";
			minOccurs = 0;
			simpleType_lazy = () -> LimitType4Code.mmObject();
		}

		@Override
		public List<LimitType4Code> getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getLimitType();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, List<LimitType4Code> value) {
			obj.setLimitType(value);
		}
	};
	@XmlElement(name = "JrnlActvtyDt", required = true)
	protected ISODate journalActivityDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "JrnlActvtyDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "JournalActivityDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date upon which journal activity takes place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, ISODate> mmJournalActivityDate = new MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, ISODate>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "JrnlActvtyDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "JournalActivityDate";
			definition = "Date upon which journal activity takes place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public ISODate getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getJournalActivityDate();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, ISODate value) {
			obj.setJournalActivityDate(value);
		}
	};
	@XmlElement(name = "AcctId")
	protected AccountIdentification4Choice accountIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AccountIdentification4Choice
	 * AccountIdentification4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Account#mmIdentification
	 * Account.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
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
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitUtilisationJournalSearchCriteria1, Optional<AccountIdentification4Choice>> mmAccountIdentification = new MMMessageAssociationEnd<LimitUtilisationJournalSearchCriteria1, Optional<AccountIdentification4Choice>>() {
		{
			businessElementTrace_lazy = () -> Account.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AccountIdentification4Choice.mmObject();
		}

		@Override
		public Optional<AccountIdentification4Choice> getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, Optional<AccountIdentification4Choice> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "LmtCcy")
	protected ActiveCurrencyCode limitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Limit#mmCurrency
	 * Limit.mmCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LmtCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LimitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Currency unit used to specify the limit amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, Optional<ActiveCurrencyCode>> mmLimitCurrency = new MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, Optional<ActiveCurrencyCode>>() {
		{
			businessElementTrace_lazy = () -> Limit.mmCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "LmtCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LimitCurrency";
			definition = "Currency unit used to specify the limit amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyCode> getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getLimitCurrency();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, Optional<ActiveCurrencyCode> value) {
			obj.setLimitCurrency(value.orElse(null));
		}
	};
	@XmlElement(name = "AcctOwnr")
	protected BICFIIdentifier accountOwner;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.BICFIIdentifier
	 * BICFIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmBICFI
	 * OrganisationIdentification.mmBICFI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwner"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Owner of the account which is being queried."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, Optional<BICFIIdentifier>> mmAccountOwner = new MMMessageAttribute<LimitUtilisationJournalSearchCriteria1, Optional<BICFIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmBICFI;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwner";
			definition = "Owner of the account which is being queried.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BICFIIdentifier.mmObject();
		}

		@Override
		public Optional<BICFIIdentifier> getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getAccountOwner();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, Optional<BICFIIdentifier> value) {
			obj.setAccountOwner(value.orElse(null));
		}
	};
	@XmlElement(name = "BilLmtCtrPtyId", required = true)
	protected SystemPartyIdentification4 bilateralLimitCounterpartyIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SystemPartyIdentification4
	 * SystemPartyIdentification4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Organisation#mmOrganisationIdentification
	 * Organisation.mmOrganisationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1
	 * LimitUtilisationJournalSearchCriteria1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BilLmtCtrPtyId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BilateralLimitCounterpartyIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the system member for which the limit is established."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<LimitUtilisationJournalSearchCriteria1, SystemPartyIdentification4> mmBilateralLimitCounterpartyIdentification = new MMMessageAssociationEnd<LimitUtilisationJournalSearchCriteria1, SystemPartyIdentification4>() {
		{
			businessElementTrace_lazy = () -> Organisation.mmOrganisationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmObject();
			isDerived = false;
			xmlTag = "BilLmtCtrPtyId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BilateralLimitCounterpartyIdentification";
			definition = "Identification of the system member for which the limit is established.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> SystemPartyIdentification4.mmObject();
		}

		@Override
		public SystemPartyIdentification4 getValue(LimitUtilisationJournalSearchCriteria1 obj) {
			return obj.getBilateralLimitCounterpartyIdentification();
		}

		@Override
		public void setValue(LimitUtilisationJournalSearchCriteria1 obj, SystemPartyIdentification4 value) {
			obj.setBilateralLimitCounterpartyIdentification(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmLimitType, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmJournalActivityDate,
						com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmAccountIdentification, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmLimitCurrency,
						com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmAccountOwner, com.tools20022.repository.msg.LimitUtilisationJournalSearchCriteria1.mmBilateralLimitCounterpartyIdentification);
				trace_lazy = () -> RiskManagementLimit.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "LimitUtilisationJournalSearchCriteria1";
				definition = "Defines the criteria used to search for a limit.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<LimitType4Code> getLimitType() {
		return limitType == null ? limitType = new ArrayList<>() : limitType;
	}

	public LimitUtilisationJournalSearchCriteria1 setLimitType(List<LimitType4Code> limitType) {
		this.limitType = Objects.requireNonNull(limitType);
		return this;
	}

	public ISODate getJournalActivityDate() {
		return journalActivityDate;
	}

	public LimitUtilisationJournalSearchCriteria1 setJournalActivityDate(ISODate journalActivityDate) {
		this.journalActivityDate = Objects.requireNonNull(journalActivityDate);
		return this;
	}

	public Optional<AccountIdentification4Choice> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public LimitUtilisationJournalSearchCriteria1 setAccountIdentification(AccountIdentification4Choice accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public Optional<ActiveCurrencyCode> getLimitCurrency() {
		return limitCurrency == null ? Optional.empty() : Optional.of(limitCurrency);
	}

	public LimitUtilisationJournalSearchCriteria1 setLimitCurrency(ActiveCurrencyCode limitCurrency) {
		this.limitCurrency = limitCurrency;
		return this;
	}

	public Optional<BICFIIdentifier> getAccountOwner() {
		return accountOwner == null ? Optional.empty() : Optional.of(accountOwner);
	}

	public LimitUtilisationJournalSearchCriteria1 setAccountOwner(BICFIIdentifier accountOwner) {
		this.accountOwner = accountOwner;
		return this;
	}

	public SystemPartyIdentification4 getBilateralLimitCounterpartyIdentification() {
		return bilateralLimitCounterpartyIdentification;
	}

	public LimitUtilisationJournalSearchCriteria1 setBilateralLimitCounterpartyIdentification(SystemPartyIdentification4 bilateralLimitCounterpartyIdentification) {
		this.bilateralLimitCounterpartyIdentification = Objects.requireNonNull(bilateralLimitCounterpartyIdentification);
		return this;
	}
}