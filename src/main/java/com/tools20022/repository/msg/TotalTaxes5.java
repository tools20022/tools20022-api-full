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
import com.tools20022.repository.codeset.EUCapitalGain2Code;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.InvestmentFundTax;
import com.tools20022.repository.entity.SecuritiesTax;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information regarding the total amount of taxes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5#mmEUCapitalGain
 * TotalTaxes5.mmEUCapitalGain}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TotalTaxes5#mmPercentageOfDebtClaim
 * TotalTaxes5.mmPercentageOfDebtClaim}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TotalTaxes5#mmTaxDetails
 * TotalTaxes5.mmTaxDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundTax
 * InvestmentFundTax}</li>
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
 * "TotalTaxes5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information regarding the total amount of taxes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TotalTaxes5", propOrder = {"EUCapitalGain", "percentageOfDebtClaim", "taxDetails"})
public class TotalTaxes5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected EUCapitalGain2Code eUCapitalGain;
	/**
	 * Specifies whether capital gain is in the scope of the European directive
	 * on taxation of savings income in the form of interest payments (Council
	 * Directive 2003/48/EC 3 June), or an income realised upon sale, a refund
	 * or redemption of shares and units, etc.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.EUCapitalGain2Code
	 * EUCapitalGain2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTax#mmEUCapitalGain
	 * SecuritiesTax.mmEUCapitalGain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5 TotalTaxes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EUCptlGn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EUCapitalGain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEUCapitalGain = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTax.mmEUCapitalGain;
			componentContext_lazy = () -> TotalTaxes5.mmObject();
			isDerived = false;
			xmlTag = "EUCptlGn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EUCapitalGain";
			definition = "Specifies whether capital gain is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June), or an income realised upon sale, a refund or redemption of shares and units, etc.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> EUCapitalGain2Code.mmObject();
		}
	};
	protected PercentageRate percentageOfDebtClaim;
	/**
	 * Percentage of the underlying assets of the funds that represents a debt
	 * and is in the scope of the European directive on taxation of savings
	 * income in the form of interest payments (Council Directive 2003/48/EC 3
	 * June).
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax#mmPercentageOfDebtClaim
	 * InvestmentFundTax.mmPercentageOfDebtClaim}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5 TotalTaxes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfDebtClm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfDebtClaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentageOfDebtClaim = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTax.mmPercentageOfDebtClaim;
			componentContext_lazy = () -> TotalTaxes5.mmObject();
			isDerived = false;
			xmlTag = "PctgOfDebtClm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfDebtClaim";
			definition = "Percentage of the underlying assets of the funds that represents a debt and is in the scope of the European directive on taxation of savings income in the form of interest payments (Council Directive 2003/48/EC 3 June).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Tax20> taxDetails;
	/**
	 * Information related to a specific tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax20 Tax20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTax
	 * InvestmentFundTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TotalTaxes5 TotalTaxes5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information related to a specific tax."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundTax.mmObject();
			componentContext_lazy = () -> TotalTaxes5.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Information related to a specific tax.";
			maxOccurs = 7;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax20.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TotalTaxes5.mmEUCapitalGain, TotalTaxes5.mmPercentageOfDebtClaim, TotalTaxes5.mmTaxDetails);
				trace_lazy = () -> InvestmentFundTax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TotalTaxes5";
				definition = "Information regarding the total amount of taxes.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "EUCptlGn")
	public EUCapitalGain2Code getEUCapitalGain() {
		return eUCapitalGain;
	}

	public void setEUCapitalGain(EUCapitalGain2Code eUCapitalGain) {
		this.eUCapitalGain = eUCapitalGain;
	}

	@XmlElement(name = "PctgOfDebtClm")
	public PercentageRate getPercentageOfDebtClaim() {
		return percentageOfDebtClaim;
	}

	public void setPercentageOfDebtClaim(PercentageRate percentageOfDebtClaim) {
		this.percentageOfDebtClaim = percentageOfDebtClaim;
	}

	@XmlElement(name = "TaxDtls")
	public List<Tax20> getTaxDetails() {
		return taxDetails;
	}

	public void setTaxDetails(List<com.tools20022.repository.msg.Tax20> taxDetails) {
		this.taxDetails = taxDetails;
	}
}