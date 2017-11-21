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
import com.tools20022.repository.choice.PartyIdentification70Choice;
import com.tools20022.repository.codeset.CountryCode;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.entity.TaxPayer;
import com.tools20022.repository.entity.TaxRecipient;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information for tax reporting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxationCountry
 * TaxReporting1.mmTaxationCountry}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxRate
 * TaxReporting1.mmTaxRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxPayer
 * TaxReporting1.mmTaxPayer}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#mmTaxRecipient
 * TaxReporting1.mmTaxRecipient}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxReporting1#mmCashAccountDetails
 * TaxReporting1.mmCashAccountDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting1#mmDescription
 * TaxReporting1.mmDescription}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxReporting1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information for tax reporting."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2 TaxReporting2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TaxReporting1", propOrder = {"taxationCountry", "taxRate", "taxPayer", "taxRecipient", "cashAccountDetails", "description"})
public class TaxReporting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected CountryCode taxationCountry;
	/**
	 * Country of taxation of the organisation or individual person.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.CountryCode
	 * CountryCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmCountry Tax.mmCountry}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxtnCtry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxationCountry"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Country of taxation of the organisation or individual person."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxationCountry
	 * TaxReporting2.mmTaxationCountry}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxationCountry = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmCountry;
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "TaxtnCtry";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxationCountry";
			definition = "Country of taxation of the organisation or individual person.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmTaxationCountry);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CountryCode.mmObject();
		}
	};
	protected PercentageRate taxRate;
	/**
	 * Tax rate to be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax rate to be applied."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRate
	 * TaxReporting2.mmTaxRate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "TaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRate";
			definition = "Tax rate to be applied.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmTaxRate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PartyIdentification70Choice taxPayer;
	/**
	 * Party that pays the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxPayer TaxPayer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxPyer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPayer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that pays the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxPayer
	 * TaxReporting2.mmTaxPayer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxPayer = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TaxPayer.mmObject();
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "TaxPyer";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPayer";
			definition = "Party that pays the tax.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmTaxPayer);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected PartyIdentification70Choice taxRecipient;
	/**
	 * Party that receives the tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification70Choice
	 * PartyIdentification70Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxRecipient TaxRecipient}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxRecipient"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that receives the tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmTaxRecipient
	 * TaxReporting2.mmTaxRecipient}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxRecipient = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> TaxRecipient.mmObject();
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "TaxRcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxRecipient";
			definition = "Party that receives the tax.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmTaxRecipient);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentification70Choice.mmObject();
		}
	};
	protected CashAccount32 cashAccountDetails;
	/**
	 * Cash account information for the payment of tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashAccount32
	 * CashAccount32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxAccount
	 * Tax.mmTaxAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash account information for the payment of tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmCashAccountDetails
	 * TaxReporting2.mmCashAccountDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxAccount;
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "CshAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAccountDetails";
			definition = "Cash account information for the payment of tax.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmCashAccountDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashAccount32.mmObject();
		}
	};
	protected Max350Text description;
	/**
	 * Additional information for the reporting of tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxReporting1 TaxReporting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information for the reporting of tax."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.TaxReporting2#mmDescription
	 * TaxReporting2.mmDescription}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDescription = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxReporting1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Additional information for the reporting of tax.";
			nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmDescription);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxReporting1.mmTaxationCountry, TaxReporting1.mmTaxRate, TaxReporting1.mmTaxPayer, TaxReporting1.mmTaxRecipient, TaxReporting1.mmCashAccountDetails, TaxReporting1.mmDescription);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TaxReporting1";
				definition = "Information for tax reporting.";
				nextVersions_lazy = () -> Arrays.asList(TaxReporting2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TaxtnCtry", required = true)
	public CountryCode getTaxationCountry() {
		return taxationCountry;
	}

	public void setTaxationCountry(CountryCode taxationCountry) {
		this.taxationCountry = taxationCountry;
	}

	@XmlElement(name = "TaxRate")
	public PercentageRate getTaxRate() {
		return taxRate;
	}

	public void setTaxRate(PercentageRate taxRate) {
		this.taxRate = taxRate;
	}

	@XmlElement(name = "TaxPyer")
	public PartyIdentification70Choice getTaxPayer() {
		return taxPayer;
	}

	public void setTaxPayer(PartyIdentification70Choice taxPayer) {
		this.taxPayer = taxPayer;
	}

	@XmlElement(name = "TaxRcpt")
	public PartyIdentification70Choice getTaxRecipient() {
		return taxRecipient;
	}

	public void setTaxRecipient(PartyIdentification70Choice taxRecipient) {
		this.taxRecipient = taxRecipient;
	}

	@XmlElement(name = "CshAcctDtls")
	public CashAccount32 getCashAccountDetails() {
		return cashAccountDetails;
	}

	public void setCashAccountDetails(com.tools20022.repository.msg.CashAccount32 cashAccountDetails) {
		this.cashAccountDetails = cashAccountDetails;
	}

	@XmlElement(name = "Desc")
	public Max350Text getDescription() {
		return description;
	}

	public void setDescription(Max350Text description) {
		this.description = description;
	}
}