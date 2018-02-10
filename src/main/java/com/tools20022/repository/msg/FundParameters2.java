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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Fund parameters.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters2#mmFinancialInstrumentDetails
 * FundParameters2.mmFinancialInstrumentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters2#mmFundManagementCompany
 * FundParameters2.mmFundManagementCompany}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundParameters2#mmDateFrom
 * FundParameters2.mmDateFrom}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters2#mmCountryOfDomicile
 * FundParameters2.mmCountryOfDomicile}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundParameters2#mmRegisteredDistributionCountry
 * FundParameters2.mmRegisteredDistributionCountry}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReportParameterRule#forFundParameters2
 * ConstraintReportParameterRule.forFundParameters2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundParameters2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Fund parameters."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundParameters2", propOrder = {"financialInstrumentDetails", "fundManagementCompany", "dateFrom", "countryOfDomicile", "registeredDistributionCountry"})
public class FundParameters2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "FinInstrmDtls")
	protected List<com.tools20022.repository.msg.FinancialInstrument17> financialInstrumentDetails;
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
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
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters2.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument for which the fund processing passport report report is requested.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument17.mmObject();
		}
	};
	@XmlElement(name = "FndMgmtCpny")
	protected PartyIdentification2Choice fundManagementCompany;
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
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
	public static final MMMessageAttribute mmFundManagementCompany = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters2.mmObject();
			isDerived = false;
			xmlTag = "FndMgmtCpny";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FundManagementCompany";
			definition = "Fund management company for which the report is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PartyIdentification2Choice.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
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
	 * "Specifies the start date of the period for which the report is requested."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateFrom = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters2.mmObject();
			isDerived = false;
			xmlTag = "DtFr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateFrom";
			definition = "Specifies the start date of the period for which the report is requested.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
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
	public static final MMMessageAttribute mmCountryOfDomicile = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFund.mmDomicileCountry;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters2.mmObject();
			isDerived = false;
			xmlTag = "CtryOfDmcl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CountryOfDomicile";
			definition = "Country where the fund has legal domicile as reflected in the ISIN classification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundParameters2
	 * FundParameters2}</li>
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
	public static final MMMessageAttribute mmRegisteredDistributionCountry = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.FundParameters2.mmObject();
			isDerived = false;
			xmlTag = "RegdDstrbtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredDistributionCountry";
			definition = "Countries where the fund is registered for distribution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundParameters2.mmFinancialInstrumentDetails, com.tools20022.repository.msg.FundParameters2.mmFundManagementCompany,
						com.tools20022.repository.msg.FundParameters2.mmDateFrom, com.tools20022.repository.msg.FundParameters2.mmCountryOfDomicile, com.tools20022.repository.msg.FundParameters2.mmRegisteredDistributionCountry);
				trace_lazy = () -> InvestmentFund.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReportParameterRule.forFundParameters2);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "FundParameters2";
				definition = "Fund parameters.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<FinancialInstrument17> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? financialInstrumentDetails = new ArrayList<>() : financialInstrumentDetails;
	}

	public FundParameters2 setFinancialInstrumentDetails(List<com.tools20022.repository.msg.FinancialInstrument17> financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public Optional<PartyIdentification2Choice> getFundManagementCompany() {
		return fundManagementCompany == null ? Optional.empty() : Optional.of(fundManagementCompany);
	}

	public FundParameters2 setFundManagementCompany(PartyIdentification2Choice fundManagementCompany) {
		this.fundManagementCompany = fundManagementCompany;
		return this;
	}

	public Optional<ISODate> getDateFrom() {
		return dateFrom == null ? Optional.empty() : Optional.of(dateFrom);
	}

	public FundParameters2 setDateFrom(ISODate dateFrom) {
		this.dateFrom = dateFrom;
		return this;
	}

	public Optional<CountryCode> getCountryOfDomicile() {
		return countryOfDomicile == null ? Optional.empty() : Optional.of(countryOfDomicile);
	}

	public FundParameters2 setCountryOfDomicile(CountryCode countryOfDomicile) {
		this.countryOfDomicile = countryOfDomicile;
		return this;
	}

	public Optional<CountryCode> getRegisteredDistributionCountry() {
		return registeredDistributionCountry == null ? Optional.empty() : Optional.of(registeredDistributionCountry);
	}

	public FundParameters2 setRegisteredDistributionCountry(CountryCode registeredDistributionCountry) {
		this.registeredDistributionCountry = registeredDistributionCountry;
		return this;
	}
}