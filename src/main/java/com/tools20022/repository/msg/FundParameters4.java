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
import com.tools20022.repository.choice.PartyIdentification2Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.entity.InvestmentFund;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrument17;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters required to request a Fund Processing Passport (FPP).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters4#mmFinancialInstrumentDetails
 * FundParameters4.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters4#mmFundManagementCompany
 * FundParameters4.mmFundManagementCompany}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundParameters4#mmDateFrom
 * FundParameters4.mmDateFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters4#mmCountryOfDomicile
 * FundParameters4.mmCountryOfDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters4#mmRegisteredDistributionCountry
 * FundParameters4.mmRegisteredDistributionCountry}</li>
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
 * "FundParameters4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Parameters required to request a Fund Processing Passport (FPP)."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundParameters4", propOrder = {"financialInstrumentDetails", "fundManagementCompany", "dateFrom", "countryOfDomicile", "registeredDistributionCountry"})
public class FundParameters4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmDtls")
	protected List<FinancialInstrument17> financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument17
	 * FinancialInstrument17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmInvestmentFundClass
	 * InvestmentFund.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Financial instrument for which the fund processing passport report report is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FundParameters4, List<FinancialInstrument17>> mmFinancialInstrumentDetails = new MMMessageAssociationEnd<FundParameters4, List<FinancialInstrument17>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters4.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument for which the fund processing passport report report is requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrument17.mmObject();
		}

		@Override
		public List<FinancialInstrument17> getValue(FundParameters4 obj) {
			return obj.getFinancialInstrumentDetails();
		}

		@Override
		public void setValue(FundParameters4 obj, List<FinancialInstrument17> value) {
			obj.setFinancialInstrumentDetails(value);
		}
	};
	@XmlElement(name = "FndMgmtCpny")
	protected List<PartyIdentification2Choice> fundManagementCompany;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification2Choice
	 * PartyIdentification2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FndMgmtCpny"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FundManagementCompany"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Fund management company for which the report is requested."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundParameters4, List<PartyIdentification2Choice>> mmFundManagementCompany = new MMMessageAttribute<FundParameters4, List<PartyIdentification2Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters4.mmObject();
			isDerived = false;
			xmlTag = "FndMgmtCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			definition = "Fund management company for which the report is requested.";
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
		}

		@Override
		public List<PartyIdentification2Choice> getValue(FundParameters4 obj) {
			return obj.getFundManagementCompany();
		}

		@Override
		public void setValue(FundParameters4 obj, List<PartyIdentification2Choice> value) {
			obj.setFundManagementCompany(value);
		}
	};
	@XmlElement(name = "DtFr")
	protected ISODate dateFrom;
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtFr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateFrom"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the date on or after which the information required will have been last updated. Only the most recent versions of the data is required."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundParameters4, Optional<ISODate>> mmDateFrom = new MMMessageAttribute<FundParameters4, Optional<ISODate>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters4.mmObject();
			isDerived = false;
			xmlTag = "DtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateFrom";
			definition = "Specifies the date on or after which the information required will have been last updated. Only the most recent versions of the data is required.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(FundParameters4 obj) {
			return obj.getDateFrom();
		}

		@Override
		public void setValue(FundParameters4 obj, Optional<ISODate> value) {
			obj.setDateFrom(value.orElse(null));
		}
	};
	@XmlElement(name = "CtryOfDmcl")
	protected CountryCode countryOfDomicile;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFund#mmDomicileCountry
	 * InvestmentFund.mmDomicileCountry}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtryOfDmcl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CountryOfDomicile"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country where the fund has legal domicile as reflected in the ISIN classification."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundParameters4, Optional<CountryCode>> mmCountryOfDomicile = new MMMessageAttribute<FundParameters4, Optional<CountryCode>>() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmDomicileCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters4.mmObject();
			isDerived = false;
			xmlTag = "CtryOfDmcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfDomicile";
			definition = "Country where the fund has legal domicile as reflected in the ISIN classification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FundParameters4 obj) {
			return obj.getCountryOfDomicile();
		}

		@Override
		public void setValue(FundParameters4 obj, Optional<CountryCode> value) {
			obj.setCountryOfDomicile(value.orElse(null));
		}
	};
	@XmlElement(name = "RegdDstrbtnCtry")
	protected CountryCode registeredDistributionCountry;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundParameters4
	 * FundParameters4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdDstrbtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredDistributionCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Countries where the fund is registered for distribution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<FundParameters4, Optional<CountryCode>> mmRegisteredDistributionCountry = new MMMessageAttribute<FundParameters4, Optional<CountryCode>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters4.mmObject();
			isDerived = false;
			xmlTag = "RegdDstrbtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Countries where the fund is registered for distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}

		@Override
		public Optional<CountryCode> getValue(FundParameters4 obj) {
			return obj.getRegisteredDistributionCountry();
		}

		@Override
		public void setValue(FundParameters4 obj, Optional<CountryCode> value) {
			obj.setRegisteredDistributionCountry(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundParameters4.mmFinancialInstrumentDetails, com.tools20022.repository.msg.FundParameters4.mmFundManagementCompany,
						com.tools20022.repository.msg.FundParameters4.mmDateFrom, com.tools20022.repository.msg.FundParameters4.mmCountryOfDomicile, com.tools20022.repository.msg.FundParameters4.mmRegisteredDistributionCountry);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundParameters4";
				definition = "Parameters required to request a Fund Processing Passport (FPP).";
			}
		});
		return mmObject_lazy.get();
	}

	public List<FinancialInstrument17> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public FundParameters4 setFinancialInstrumentDetails(List<FinancialInstrument17> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public List<PartyIdentification2Choice> getFundManagementCompany() {
		return fundManagementCompany == null ? fundManagementCompany = new ArrayList<>() : fundManagementCompany;
	}

	public FundParameters4 setFundManagementCompany(List<PartyIdentification2Choice> fundManagementCompany) {
		this.fundManagementCompany = Objects.requireNonNull(fundManagementCompany);
		return this;
	}

	public Optional<ISODate> getDateFrom() {
		return dateFrom == null ? Optional.empty() : Optional.of(dateFrom);
	}

	public FundParameters4 setDateFrom(ISODate dateFrom) {
		this.dateFrom = dateFrom;
		return this;
	}

	public Optional<CountryCode> getCountryOfDomicile() {
		return countryOfDomicile == null ? Optional.empty() : Optional.of(countryOfDomicile);
	}

	public FundParameters4 setCountryOfDomicile(CountryCode countryOfDomicile) {
		this.countryOfDomicile = countryOfDomicile;
		return this;
	}

	public Optional<CountryCode> getRegisteredDistributionCountry() {
		return registeredDistributionCountry == null ? Optional.empty() : Optional.of(registeredDistributionCountry);
	}

	public FundParameters4 setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = registeredDistributionCountry;
		return this;
	}
}