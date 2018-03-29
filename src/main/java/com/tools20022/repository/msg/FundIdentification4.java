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
import com.tools20022.repository.choice.PartyIdentification73Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentification60;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Distinct pool of financial instruments managed by a single investment policy.
 * May or may not be part of an umbrella fund.The pool is issued in at least one
 * investment fund class.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification4#mmFundIdentification
 * FundIdentification4.mmFundIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification4#mmAccountIdentificationWithCustodian
 * FundIdentification4.mmAccountIdentificationWithCustodian}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundIdentification4#mmCustodianIdentification
 * FundIdentification4.mmCustodianIdentification}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFund
 * InvestmentFund}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundIdentification4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Distinct pool of financial instruments managed by a single investment policy. May or may not be part of an umbrella fund.The pool is issued in at least one investment fund class."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.FundIdentification3
 * FundIdentification3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundIdentification4", propOrder = {"fundIdentification", "accountIdentificationWithCustodian", "custodianIdentification"})
public class FundIdentification4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FndId", required = true)
	protected PartyIdentification60 fundIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentification60
	 * PartyIdentification60}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmIdentification
	 * InvestmentFund.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification4
	 * FundIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the investment fund."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundIdentification4, PartyIdentification60> mmFundIdentification = new MMMessageAttribute<FundIdentification4, PartyIdentification60>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification4.mmObject();
			isDerived = false;
			xmlTag = "FndId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundIdentification";
			definition = "Identification of the investment fund.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification60.mmObject();
		}

		@Override
		public PartyIdentification60 getValue(FundIdentification4 obj) {
			return obj.getFundIdentification();
		}

		@Override
		public void setValue(FundIdentification4 obj, PartyIdentification60 value) {
			obj.setFundIdentification(value);
		}
	};
	@XmlElement(name = "AcctIdWthCtdn")
	protected Max35Text accountIdentificationWithCustodian;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification4
	 * FundIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctIdWthCtdn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentificationWithCustodian"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the account of the fund held with the custodian."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundIdentification4, Optional<Max35Text>> mmAccountIdentificationWithCustodian = new MMMessageAttribute<FundIdentification4, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification4.mmObject();
			isDerived = false;
			xmlTag = "AcctIdWthCtdn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentificationWithCustodian";
			definition = "Identifies the account of the fund held with the custodian.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(FundIdentification4 obj) {
			return obj.getAccountIdentificationWithCustodian();
		}

		@Override
		public void setValue(FundIdentification4 obj, Optional<Max35Text> value) {
			obj.setAccountIdentificationWithCustodian(value.orElse(null));
		}
	};
	@XmlElement(name = "CtdnId")
	protected PartyIdentification73Choice custodianIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification73Choice
	 * PartyIdentification73Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundIdentification4
	 * FundIdentification4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtdnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CustodianIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the custodian which services the account of the fund."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundIdentification4, Optional<PartyIdentification73Choice>> mmCustodianIdentification = new MMMessageAssociationEnd<FundIdentification4, Optional<PartyIdentification73Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundIdentification4.mmObject();
			isDerived = false;
			xmlTag = "CtdnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CustodianIdentification";
			definition = "Identification of the custodian which services the account of the fund.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification73Choice.mmObject();
		}

		@Override
		public Optional<PartyIdentification73Choice> getValue(FundIdentification4 obj) {
			return obj.getCustodianIdentification();
		}

		@Override
		public void setValue(FundIdentification4 obj, Optional<PartyIdentification73Choice> value) {
			obj.setCustodianIdentification(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundIdentification4.mmFundIdentification, com.tools20022.repository.msg.FundIdentification4.mmAccountIdentificationWithCustodian,
						com.tools20022.repository.msg.FundIdentification4.mmCustodianIdentification);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundIdentification4";
				definition = "Distinct pool of financial instruments managed by a single investment policy. May or may not be part of an umbrella fund.The pool is issued in at least one investment fund class.";
				previousVersion_lazy = () -> FundIdentification3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public PartyIdentification60 getFundIdentification() {
		return fundIdentification;
	}

	public FundIdentification4 setFundIdentification(PartyIdentification60 fundIdentification) {
		this.fundIdentification = Objects.requireNonNull(fundIdentification);
		return this;
	}

	public Optional<Max35Text> getAccountIdentificationWithCustodian() {
		return accountIdentificationWithCustodian == null ? Optional.empty() : Optional.of(accountIdentificationWithCustodian);
	}

	public FundIdentification4 setAccountIdentificationWithCustodian(Max35Text accountIdentificationWithCustodian) {
		this.accountIdentificationWithCustodian = accountIdentificationWithCustodian;
		return this;
	}

	public Optional<PartyIdentification73Choice> getCustodianIdentification() {
		return custodianIdentification == null ? Optional.empty() : Optional.of(custodianIdentification);
	}

	public FundIdentification4 setCustodianIdentification(PartyIdentification73Choice custodianIdentification) {
		this.custodianIdentification = custodianIdentification;
		return this;
	}
}