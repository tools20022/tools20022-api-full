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
import com.tools20022.repository.choice.*;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies rates.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingTax
 * CorporateActionRate2.mmWithholdingTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfForeignTax
 * CorporateActionRate2.mmWithholdingOfForeignTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmWithholdingOfLocalTax
 * CorporateActionRate2.mmWithholdingOfLocalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax1
 * CorporateActionRate2.mmGermanLocalTax1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax2
 * CorporateActionRate2.mmGermanLocalTax2}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax3
 * CorporateActionRate2.mmGermanLocalTax3}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGermanLocalTax4
 * CorporateActionRate2.mmGermanLocalTax4}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnIncome
 * CorporateActionRate2.mmTaxOnIncome}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxOnProfit
 * CorporateActionRate2.mmTaxOnProfit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmTaxReclaim
 * CorporateActionRate2.mmTaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFiscalStamp
 * CorporateActionRate2.mmFiscalStamp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmProration
 * CorporateActionRate2.mmProration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNewToOld
 * CorporateActionRate2.mmNewToOld}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNewSecuritiesToUnderlyingSecurities
 * CorporateActionRate2.mmNewSecuritiesToUnderlyingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalQuantityForExistingSecurities
 * CorporateActionRate2.mmAdditionalQuantityForExistingSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalQuantityForSubscribedResultantSecurities
 * CorporateActionRate2.mmAdditionalQuantityForSubscribedResultantSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmRelatedTax
 * CorporateActionRate2.mmRelatedTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNonResidentRate
 * CorporateActionRate2.mmNonResidentRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmCharges
 * CorporateActionRate2.mmCharges}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmInterestForUsedPayment
 * CorporateActionRate2.mmInterestForUsedPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmIndexFactor
 * CorporateActionRate2.mmIndexFactor}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFullyFranked
 * CorporateActionRate2.mmFullyFranked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmGrossDividend
 * CorporateActionRate2.mmGrossDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmNetDividend
 * CorporateActionRate2.mmNetDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmFinalDividend
 * CorporateActionRate2.mmFinalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmProvisionalDividend
 * CorporateActionRate2.mmProvisionalDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmCashIncentive
 * CorporateActionRate2.mmCashIncentive}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmSolicitationFee
 * CorporateActionRate2.mmSolicitationFee}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmMaximumAllowedOversubscription
 * CorporateActionRate2.mmMaximumAllowedOversubscription}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmAdditionalTax
 * CorporateActionRate2.mmAdditionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmOriginalAmount
 * CorporateActionRate2.mmOriginalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmExchangeRate
 * CorporateActionRate2.mmExchangeRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2#mmApplicableRate
 * CorporateActionRate2.mmApplicableRate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CorporateActionEvent
 * CorporateActionEvent}</li>
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
 * "CorporateActionRate2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies rates."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CorporateActionRate2", propOrder = {"withholdingTax", "withholdingOfForeignTax", "withholdingOfLocalTax", "germanLocalTax1", "germanLocalTax2", "germanLocalTax3", "germanLocalTax4", "taxOnIncome", "taxOnProfit",
		"taxReclaim", "fiscalStamp", "proration", "newToOld", "newSecuritiesToUnderlyingSecurities", "additionalQuantityForExistingSecurities", "additionalQuantityForSubscribedResultantSecurities", "relatedTax", "nonResidentRate",
		"charges", "interestForUsedPayment", "indexFactor", "fullyFranked", "grossDividend", "netDividend", "finalDividend", "provisionalDividend", "cashIncentive", "solicitationFee", "maximumAllowedOversubscription", "additionalTax",
		"originalAmount", "exchangeRate", "applicableRate"})
public class CorporateActionRate2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RateFormat1Choice withholdingTax;
	/**
	 * Percentage of a cash distribution that will be withheld by a tax
	 * authority.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of a cash distribution that will be withheld by a tax authority."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice withholdingOfForeignTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the income was originally paid, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfFrgnTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfForeignTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfForeignTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice withholdingOfLocalTax;
	/**
	 * Rate at which the income will be withheld by the jurisdiction in which
	 * the account owner is located, for which relief at source and/or reclaim
	 * may be possible.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgOfLclTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingOfLocalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingOfLocalTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice germanLocalTax1;
	/**
	 * Local tax (ZAS Anrechnungsbetrag) subject to interest down payment tax
	 * (proportion of interest liable for interest down payment tax/interim
	 * profit that is not covered by the tax exempt amount).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrmnLclTax1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax1"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (ZAS Anrechnungsbetrag) subject to interest down payment tax (proportion of interest liable for interest down payment tax/interim profit that is not covered by the tax exempt amount)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGermanLocalTax1 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax1";
			definition = "Local tax (ZAS Anrechnungsbetrag) subject to interest down payment tax (proportion of interest liable for interest down payment tax/interim profit that is not covered by the tax exempt amount).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice germanLocalTax2;
	/**
	 * Local tax (ZAS Pflichtige Zinsen) interest liable for interest down
	 * payment tax (proportion of gross interest per unit/interim profits that
	 * is not covered by the credit in the interest pool).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrmnLclTax2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax2"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (ZAS Pflichtige Zinsen) interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGermanLocalTax2 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax2";
			definition = "Local tax (ZAS Pflichtige Zinsen) interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice germanLocalTax3;
	/**
	 * Local tax (Zinstopf) offset interest per unit against tax exempt amount
	 * (variation to offset interest per unit in relation to tax exempt amount).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrmnLclTax3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax3"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGermanLocalTax3 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax3";
			definition = "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice germanLocalTax4;
	/**
	 * Local tax (Ertrag Besitzanteilig) yield liable for interest down payment
	 * tax.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrmnLclTax4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GermanLocalTax4"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGermanLocalTax4 = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax4";
			definition = "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice taxOnIncome;
	/**
	 * Taxation applied on an amount clearly identified as an income.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnIncm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnIncome"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as an income."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxOnIncome = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Taxation applied on an amount clearly identified as an income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice taxOnProfit;
	/**
	 * Taxation applied on an amount clearly identified as capital profits,
	 * capital gains.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxOnPrft"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxOnProfit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Taxation applied on an amount clearly identified as capital profits, capital gains."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxOnProfit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfit";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice taxReclaim;
	/**
	 * Percentage of cash that was paid in excess of actual tax obligation and
	 * was reclaimed.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxRclm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxReclaim = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxRclm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice fiscalStamp;
	/**
	 * Percentage of fiscal tax to apply.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FsclStmp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FiscalStamp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Percentage of fiscal tax to apply."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFiscalStamp = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice proration;
	/**
	 * Proportionate allocation used for the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmProrationRate
	 * BiddingConditions.mmProrationRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prratn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Proportionate allocation used for the offer."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProration = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "Prratn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RatioFormat2Choice newToOld;
	/**
	 * Quantity of new securities for a given quantity of underlying securities,
	 * where the underlying securities will be exchanged or debited, eg, 2 for
	 * 1: 2 new equities credited for every 1 underlying equity debited = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewToOld
	 * SecuritiesProceedsDefinition.mmNewToOld}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewToOd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewToOld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewToOld = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NewToOd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat2Choice.mmObject();
		}
	};
	protected RatioFormat2Choice newSecuritiesToUnderlyingSecurities;
	/**
	 * Quantity of new equities that will be derived by the exercise of a given
	 * quantity of intermediate securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmNewSecuritiesToUnderlyingSecurities
	 * SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewSctiesToUndrlygScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewSecuritiesToUnderlyingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewSecuritiesToUnderlyingSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesToUndrlygScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat2Choice.mmObject();
		}
	};
	protected RatioFormat1Choice additionalQuantityForExistingSecurities;
	/**
	 * Quantity of additional securities for a given quantity of underlying
	 * securities where underlying securities are not exchanged or debited, eg,
	 * 1 for 1: 1 new equity credited for every 1 underlying equity = 2
	 * resulting equities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice
	 * RatioFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForExistingSecurities
	 * SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForExstgScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForExistingSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new\nequity credited for every 1 underlying equity = 2 resulting equities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalQuantityForExistingSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new\nequity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat1Choice.mmObject();
		}
	};
	protected RatioFormat1Choice additionalQuantityForSubscribedResultantSecurities;
	/**
	 * Quantity of additional intermediate securities/new equities awarded for a
	 * given quantity of securities derived from subscription.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat1Choice
	 * RatioFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesProceedsDefinition#mmAdditionalQuantityForSubscribedResultantSecurities
	 * SecuritiesProceedsDefinition.
	 * mmAdditionalQuantityForSubscribedResultantSecurities}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlQtyForSbcbdRsltntScties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalQuantityForSubscribedResultantSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat1Choice.mmObject();
		}
	};
	protected RelatedTaxType1 relatedTax;
	/**
	 * Percentage of the gross dividend rate on which tax must be paid .
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.RelatedTaxType1
	 * RelatedTaxType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRelatedSecurityTax
	 * TaxVoucher.mmRelatedSecurityTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Percentage of the gross dividend rate on which tax must be paid ."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRelatedTax = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "RltdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid .";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.RelatedTaxType1.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice nonResidentRate;
	/**
	 * Rate per share to which a non-resident is entitled.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonResdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonResidentRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate per share to which a non-resident is entitled."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonResidentRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice charges;
	/**
	 * Rate used to calculate the amount of the charges/fees that cannot be
	 * categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmCorporateActionCharge
	 * CorporateActionEvent.mmCorporateActionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Chrgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Charges"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of the charges/fees that cannot be categorised."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCharges = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice interestForUsedPayment;
	/**
	 * The actual interest rate used for the payment of the interest for the
	 * specified interest period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest#mmRate
	 * Interest.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrstForUsdPmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestForUsedPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The actual interest rate used for the payment of the interest for the specified interest period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInterestForUsedPayment = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "IntrstForUsdPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestForUsedPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice indexFactor;
	/**
	 * Public index rate applied to the amount paid to adjust it to inflation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexFactor
	 * Index.mmIndexFactor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxFctr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexFactor"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Public index rate applied to the amount paid to adjust it to inflation."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexFactor = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Public index rate applied to the amount paid to adjust it to inflation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice fullyFranked;
	/**
	 * Rate resulting from a fully franked dividend paid by a company; rate
	 * includes tax credit for companies that have made sufficient tax payments
	 * during fiscal period.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFullyFrankedRateAndAmount
	 * Dividend.mmFullyFrankedRateAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FullyFrnkd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullyFranked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFullyFranked = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected GrossDividendRate1Choice grossDividend;
	/**
	 * Cash dividend amount per equity before deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.GrossDividendRate1Choice
	 * GrossDividendRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmGrossDividend
	 * Dividend.mmGrossDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity before deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossDividend = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrssDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GrossDividendRate1Choice.mmObject();
		}
	};
	protected NetDividendRate1Choice netDividend;
	/**
	 * Cash dividend amount per equity after deductions or allowances have been
	 * made.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.NetDividendRate1Choice
	 * NetDividendRate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmNetDividend
	 * Dividend.mmNetDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash dividend amount per equity after deductions or allowances have been made."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetDividend = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NetDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NetDividendRate1Choice.mmObject();
		}
	};
	protected AmountAndRateFormat2Choice finalDividend;
	/**
	 * Dividend is final.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountAndRateFormat2Choice
	 * AmountAndRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmFinalDividend
	 * Dividend.mmFinalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FnlDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is final."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinalDividend = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFinalDividend;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FnlDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRateFormat2Choice.mmObject();
		}
	};
	protected AmountAndRateFormat2Choice provisionalDividend;
	/**
	 * Dividend is provisional.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.AmountAndRateFormat2Choice
	 * AmountAndRateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend#mmProvisionalDividend
	 * Dividend.mmProvisionalDividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrvsnlDvdd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProvisionalDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Dividend is provisional."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProvisionalDividend = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Dividend.mmProvisionalDividend;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRateFormat2Choice.mmObject();
		}
	};
	protected RateFormat1Choice cashIncentive;
	/**
	 * Rate of the cash premium made available if the securities holder consents
	 * or participates to an event, e.g. consent fees.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CashProceedsDefinition#mmCashIncentiveAmount
	 * CashProceedsDefinition.mmCashIncentiveAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshIncntiv"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashIncentive"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCashIncentive = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveAmount;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "CshIncntiv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentive";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice solicitationFee;
	/**
	 * Cash rate made available in an offer in order to encourage participation
	 * in the offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionFeesAndCharges#mmSolicitationFee
	 * CorporateActionFeesAndCharges.mmSolicitationFee}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SlctnFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SolicitationFee"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash rate made available in an offer in order to encourage participation in the offer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSolicitationFee = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "SlctnFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFee";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateFormat1Choice maximumAllowedOversubscription;
	/**
	 * A maximum percentage of shares available through the over subscription
	 * privilege, usually a percentage of the basic subscription shares, eg, an
	 * account owner subscribing to 100 shares may over subscribe to a maximum
	 * of 50 additional shares when the over subscription maximum is 50%.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmMaximumAllowedOverSubscription
	 * BiddingConditions.mmMaximumAllowedOverSubscription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MaxAllwdOvrsbcpt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaximumAllowedOversubscription"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMaximumAllowedOversubscription = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdOvrsbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedOversubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};
	protected RateAndAmountFormat1Choice additionalTax;
	/**
	 * Rate used for additional tax that cannot be categorised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateAndAmountFormat1Choice
	 * RateAndAmountFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rate used for additional tax that cannot be categorised."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdditionalTax = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount originalAmount;
	/**
	 * Amount in its original currency when conversion from/into another
	 * currency has occurred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmOriginalAmount
	 * CurrencyExchange.mmOriginalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount in its original currency when conversion from/into another currency has occurred."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ForeignExchangeTerms8 exchangeRate;
	/**
	 * Provides information about a foreign exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms8
	 * ForeignExchangeTerms8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmExchangeRate
	 * CorporateActionEvent.mmExchangeRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides information about a foreign exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmExchangeRate = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Provides information about a foreign exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms8.mmObject();
		}
	};
	protected RateFormat1Choice applicableRate;
	/**
	 * Rate applicable to the event announced, eg, redemption rate for a
	 * redemption event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateFormat1Choice
	 * RateFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.BiddingConditions#mmApplicableRate
	 * BiddingConditions.mmApplicableRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CorporateActionRate2
	 * CorporateActionRate2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AplblRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicableRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate applicable to the event announced, eg, redemption rate for a redemption event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicableRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CorporateActionRate2.mmWithholdingTax, CorporateActionRate2.mmWithholdingOfForeignTax, CorporateActionRate2.mmWithholdingOfLocalTax, CorporateActionRate2.mmGermanLocalTax1,
						CorporateActionRate2.mmGermanLocalTax2, CorporateActionRate2.mmGermanLocalTax3, CorporateActionRate2.mmGermanLocalTax4, CorporateActionRate2.mmTaxOnIncome, CorporateActionRate2.mmTaxOnProfit,
						CorporateActionRate2.mmTaxReclaim, CorporateActionRate2.mmFiscalStamp, CorporateActionRate2.mmProration, CorporateActionRate2.mmNewToOld, CorporateActionRate2.mmNewSecuritiesToUnderlyingSecurities,
						CorporateActionRate2.mmAdditionalQuantityForExistingSecurities, CorporateActionRate2.mmAdditionalQuantityForSubscribedResultantSecurities, CorporateActionRate2.mmRelatedTax, CorporateActionRate2.mmNonResidentRate,
						CorporateActionRate2.mmCharges, CorporateActionRate2.mmInterestForUsedPayment, CorporateActionRate2.mmIndexFactor, CorporateActionRate2.mmFullyFranked, CorporateActionRate2.mmGrossDividend,
						CorporateActionRate2.mmNetDividend, CorporateActionRate2.mmFinalDividend, CorporateActionRate2.mmProvisionalDividend, CorporateActionRate2.mmCashIncentive, CorporateActionRate2.mmSolicitationFee,
						CorporateActionRate2.mmMaximumAllowedOversubscription, CorporateActionRate2.mmAdditionalTax, CorporateActionRate2.mmOriginalAmount, CorporateActionRate2.mmExchangeRate, CorporateActionRate2.mmApplicableRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate2";
				definition = "Specifies rates.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "WhldgTax")
	public RateFormat1Choice getWithholdingTax() {
		return withholdingTax;
	}

	public void setWithholdingTax(RateFormat1Choice withholdingTax) {
		this.withholdingTax = withholdingTax;
	}

	@XmlElement(name = "WhldgOfFrgnTax")
	public RateAndAmountFormat1Choice getWithholdingOfForeignTax() {
		return withholdingOfForeignTax;
	}

	public void setWithholdingOfForeignTax(RateAndAmountFormat1Choice withholdingOfForeignTax) {
		this.withholdingOfForeignTax = withholdingOfForeignTax;
	}

	@XmlElement(name = "WhldgOfLclTax")
	public RateAndAmountFormat1Choice getWithholdingOfLocalTax() {
		return withholdingOfLocalTax;
	}

	public void setWithholdingOfLocalTax(RateAndAmountFormat1Choice withholdingOfLocalTax) {
		this.withholdingOfLocalTax = withholdingOfLocalTax;
	}

	@XmlElement(name = "GrmnLclTax1")
	public RateAndAmountFormat1Choice getGermanLocalTax1() {
		return germanLocalTax1;
	}

	public void setGermanLocalTax1(RateAndAmountFormat1Choice germanLocalTax1) {
		this.germanLocalTax1 = germanLocalTax1;
	}

	@XmlElement(name = "GrmnLclTax2")
	public RateAndAmountFormat1Choice getGermanLocalTax2() {
		return germanLocalTax2;
	}

	public void setGermanLocalTax2(RateAndAmountFormat1Choice germanLocalTax2) {
		this.germanLocalTax2 = germanLocalTax2;
	}

	@XmlElement(name = "GrmnLclTax3")
	public RateAndAmountFormat1Choice getGermanLocalTax3() {
		return germanLocalTax3;
	}

	public void setGermanLocalTax3(RateAndAmountFormat1Choice germanLocalTax3) {
		this.germanLocalTax3 = germanLocalTax3;
	}

	@XmlElement(name = "GrmnLclTax4")
	public RateAndAmountFormat1Choice getGermanLocalTax4() {
		return germanLocalTax4;
	}

	public void setGermanLocalTax4(RateAndAmountFormat1Choice germanLocalTax4) {
		this.germanLocalTax4 = germanLocalTax4;
	}

	@XmlElement(name = "TaxOnIncm")
	public RateFormat1Choice getTaxOnIncome() {
		return taxOnIncome;
	}

	public void setTaxOnIncome(RateFormat1Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
	}

	@XmlElement(name = "TaxOnPrft")
	public RateFormat1Choice getTaxOnProfit() {
		return taxOnProfit;
	}

	public void setTaxOnProfit(RateFormat1Choice taxOnProfit) {
		this.taxOnProfit = taxOnProfit;
	}

	@XmlElement(name = "TaxRclm")
	public RateFormat1Choice getTaxReclaim() {
		return taxReclaim;
	}

	public void setTaxReclaim(RateFormat1Choice taxReclaim) {
		this.taxReclaim = taxReclaim;
	}

	@XmlElement(name = "FsclStmp")
	public RateFormat1Choice getFiscalStamp() {
		return fiscalStamp;
	}

	public void setFiscalStamp(RateFormat1Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
	}

	@XmlElement(name = "Prratn")
	public RateFormat1Choice getProration() {
		return proration;
	}

	public void setProration(RateFormat1Choice proration) {
		this.proration = proration;
	}

	@XmlElement(name = "NewToOd")
	public RatioFormat2Choice getNewToOld() {
		return newToOld;
	}

	public void setNewToOld(RatioFormat2Choice newToOld) {
		this.newToOld = newToOld;
	}

	@XmlElement(name = "NewSctiesToUndrlygScties")
	public RatioFormat2Choice getNewSecuritiesToUnderlyingSecurities() {
		return newSecuritiesToUnderlyingSecurities;
	}

	public void setNewSecuritiesToUnderlyingSecurities(RatioFormat2Choice newSecuritiesToUnderlyingSecurities) {
		this.newSecuritiesToUnderlyingSecurities = newSecuritiesToUnderlyingSecurities;
	}

	@XmlElement(name = "AddtlQtyForExstgScties")
	public RatioFormat1Choice getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities;
	}

	public void setAdditionalQuantityForExistingSecurities(RatioFormat1Choice additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
	}

	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	public RatioFormat1Choice getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities;
	}

	public void setAdditionalQuantityForSubscribedResultantSecurities(RatioFormat1Choice additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
	}

	@XmlElement(name = "RltdTax")
	public RelatedTaxType1 getRelatedTax() {
		return relatedTax;
	}

	public void setRelatedTax(com.tools20022.repository.msg.RelatedTaxType1 relatedTax) {
		this.relatedTax = relatedTax;
	}

	@XmlElement(name = "NonResdtRate")
	public RateAndAmountFormat1Choice getNonResidentRate() {
		return nonResidentRate;
	}

	public void setNonResidentRate(RateAndAmountFormat1Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
	}

	@XmlElement(name = "Chrgs")
	public RateAndAmountFormat1Choice getCharges() {
		return charges;
	}

	public void setCharges(RateAndAmountFormat1Choice charges) {
		this.charges = charges;
	}

	@XmlElement(name = "IntrstForUsdPmt")
	public RateAndAmountFormat1Choice getInterestForUsedPayment() {
		return interestForUsedPayment;
	}

	public void setInterestForUsedPayment(RateAndAmountFormat1Choice interestForUsedPayment) {
		this.interestForUsedPayment = interestForUsedPayment;
	}

	@XmlElement(name = "IndxFctr")
	public RateAndAmountFormat1Choice getIndexFactor() {
		return indexFactor;
	}

	public void setIndexFactor(RateAndAmountFormat1Choice indexFactor) {
		this.indexFactor = indexFactor;
	}

	@XmlElement(name = "FullyFrnkd")
	public RateAndAmountFormat1Choice getFullyFranked() {
		return fullyFranked;
	}

	public void setFullyFranked(RateAndAmountFormat1Choice fullyFranked) {
		this.fullyFranked = fullyFranked;
	}

	@XmlElement(name = "GrssDvdd")
	public GrossDividendRate1Choice getGrossDividend() {
		return grossDividend;
	}

	public void setGrossDividend(GrossDividendRate1Choice grossDividend) {
		this.grossDividend = grossDividend;
	}

	@XmlElement(name = "NetDvdd")
	public NetDividendRate1Choice getNetDividend() {
		return netDividend;
	}

	public void setNetDividend(NetDividendRate1Choice netDividend) {
		this.netDividend = netDividend;
	}

	@XmlElement(name = "FnlDvdd")
	public AmountAndRateFormat2Choice getFinalDividend() {
		return finalDividend;
	}

	public void setFinalDividend(AmountAndRateFormat2Choice finalDividend) {
		this.finalDividend = finalDividend;
	}

	@XmlElement(name = "PrvsnlDvdd")
	public AmountAndRateFormat2Choice getProvisionalDividend() {
		return provisionalDividend;
	}

	public void setProvisionalDividend(AmountAndRateFormat2Choice provisionalDividend) {
		this.provisionalDividend = provisionalDividend;
	}

	@XmlElement(name = "CshIncntiv")
	public RateFormat1Choice getCashIncentive() {
		return cashIncentive;
	}

	public void setCashIncentive(RateFormat1Choice cashIncentive) {
		this.cashIncentive = cashIncentive;
	}

	@XmlElement(name = "SlctnFee")
	public RateFormat1Choice getSolicitationFee() {
		return solicitationFee;
	}

	public void setSolicitationFee(RateFormat1Choice solicitationFee) {
		this.solicitationFee = solicitationFee;
	}

	@XmlElement(name = "MaxAllwdOvrsbcpt")
	public RateFormat1Choice getMaximumAllowedOversubscription() {
		return maximumAllowedOversubscription;
	}

	public void setMaximumAllowedOversubscription(RateFormat1Choice maximumAllowedOversubscription) {
		this.maximumAllowedOversubscription = maximumAllowedOversubscription;
	}

	@XmlElement(name = "AddtlTax")
	public RateAndAmountFormat1Choice getAdditionalTax() {
		return additionalTax;
	}

	public void setAdditionalTax(RateAndAmountFormat1Choice additionalTax) {
		this.additionalTax = additionalTax;
	}

	@XmlElement(name = "OrgnlAmt")
	public ActiveCurrencyAndAmount getOriginalAmount() {
		return originalAmount;
	}

	public void setOriginalAmount(ActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
	}

	@XmlElement(name = "XchgRate")
	public ForeignExchangeTerms8 getExchangeRate() {
		return exchangeRate;
	}

	public void setExchangeRate(com.tools20022.repository.msg.ForeignExchangeTerms8 exchangeRate) {
		this.exchangeRate = exchangeRate;
	}

	@XmlElement(name = "AplblRate")
	public RateFormat1Choice getApplicableRate() {
		return applicableRate;
	}

	public void setApplicableRate(RateFormat1Choice applicableRate) {
		this.applicableRate = applicableRate;
	}
}