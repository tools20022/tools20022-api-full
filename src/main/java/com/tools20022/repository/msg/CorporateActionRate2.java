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
import com.tools20022.repository.msg.ForeignExchangeTerms8;
import com.tools20022.repository.msg.RelatedTaxType1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CorporateActionRate2", propOrder = {"withholdingTax", "withholdingOfForeignTax", "withholdingOfLocalTax", "germanLocalTax1", "germanLocalTax2", "germanLocalTax3", "germanLocalTax4", "taxOnIncome", "taxOnProfit",
		"taxReclaim", "fiscalStamp", "proration", "newToOld", "newSecuritiesToUnderlyingSecurities", "additionalQuantityForExistingSecurities", "additionalQuantityForSubscribedResultantSecurities", "relatedTax", "nonResidentRate",
		"charges", "interestForUsedPayment", "indexFactor", "fullyFranked", "grossDividend", "netDividend", "finalDividend", "provisionalDividend", "cashIncentive", "solicitationFee", "maximumAllowedOversubscription", "additionalTax",
		"originalAmount", "exchangeRate", "applicableRate"})
public class CorporateActionRate2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "WhldgTax")
	protected RateFormat1Choice withholdingTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmWithholdingTax = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTax";
			definition = "Percentage of a cash distribution that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getWithholdingTax();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setWithholdingTax(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgOfFrgnTax")
	protected RateAndAmountFormat1Choice withholdingOfForeignTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmWithholdingOfForeignTax = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfFrgnTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfForeignTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the income was originally paid, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getWithholdingOfForeignTax();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setWithholdingOfForeignTax(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgOfLclTax")
	protected RateAndAmountFormat1Choice withholdingOfLocalTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmWithholdingOfLocalTax = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "WhldgOfLclTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingOfLocalTax";
			definition = "Rate at which the income will be withheld by the jurisdiction in which the account owner is located, for which relief at source and/or reclaim may be possible.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getWithholdingOfLocalTax();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setWithholdingOfLocalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "GrmnLclTax1")
	protected RateAndAmountFormat1Choice germanLocalTax1;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmGermanLocalTax1 = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax1";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax1";
			definition = "Local tax (ZAS Anrechnungsbetrag) subject to interest down payment tax (proportion of interest liable for interest down payment tax/interim profit that is not covered by the tax exempt amount).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getGermanLocalTax1();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setGermanLocalTax1(value.orElse(null));
		}
	};
	@XmlElement(name = "GrmnLclTax2")
	protected RateAndAmountFormat1Choice germanLocalTax2;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmGermanLocalTax2 = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax2";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax2";
			definition = "Local tax (ZAS Pflichtige Zinsen) interest liable for interest down payment tax (proportion of gross interest per unit/interim profits that is not covered by the credit in the interest pool).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getGermanLocalTax2();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setGermanLocalTax2(value.orElse(null));
		}
	};
	@XmlElement(name = "GrmnLclTax3")
	protected RateAndAmountFormat1Choice germanLocalTax3;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmGermanLocalTax3 = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax3";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax3";
			definition = "Local tax (Zinstopf) offset interest per unit against tax exempt amount (variation to offset interest per unit in relation to tax exempt amount).";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getGermanLocalTax3();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setGermanLocalTax3(value.orElse(null));
		}
	};
	@XmlElement(name = "GrmnLclTax4")
	protected RateAndAmountFormat1Choice germanLocalTax4;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmGermanLocalTax4 = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrmnLclTax4";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GermanLocalTax4";
			definition = "Local tax (Ertrag Besitzanteilig) yield liable for interest down payment tax.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getGermanLocalTax4();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setGermanLocalTax4(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnIncm")
	protected RateFormat1Choice taxOnIncome;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmTaxOnIncome = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnIncm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnIncome";
			definition = "Taxation applied on an amount clearly identified as an income.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getTaxOnIncome();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setTaxOnIncome(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxOnPrft")
	protected RateFormat1Choice taxOnProfit;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmTaxOnProfit = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxOnPrft";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxOnProfit";
			definition = "Taxation applied on an amount clearly identified as capital profits, capital gains.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getTaxOnProfit();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setTaxOnProfit(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxRclm")
	protected RateFormat1Choice taxReclaim;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmTaxReclaim = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "TaxRclm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			definition = "Percentage of cash that was paid in excess of actual tax obligation and was reclaimed.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getTaxReclaim();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setTaxReclaim(value.orElse(null));
		}
	};
	@XmlElement(name = "FsclStmp")
	protected RateFormat1Choice fiscalStamp;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmFiscalStamp = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FsclStmp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FiscalStamp";
			definition = "Percentage of fiscal tax to apply.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getFiscalStamp();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setFiscalStamp(value.orElse(null));
		}
	};
	@XmlElement(name = "Prratn")
	protected RateFormat1Choice proration;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmProration = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmProrationRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "Prratn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proration";
			definition = "Proportionate allocation used for the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getProration();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setProration(value.orElse(null));
		}
	};
	@XmlElement(name = "NewToOd")
	protected RatioFormat2Choice newToOld;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat2Choice>> mmNewToOld = new MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewToOld;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NewToOd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewToOld";
			definition = "Quantity of new securities for a given quantity of underlying securities, where the underlying securities will be exchanged or debited, eg, 2 for 1: 2 new equities credited for every 1 underlying equity debited = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat2Choice.mmObject();
		}

		@Override
		public Optional<RatioFormat2Choice> getValue(CorporateActionRate2 obj) {
			return obj.getNewToOld();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RatioFormat2Choice> value) {
			obj.setNewToOld(value.orElse(null));
		}
	};
	@XmlElement(name = "NewSctiesToUndrlygScties")
	protected RatioFormat2Choice newSecuritiesToUnderlyingSecurities;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat2Choice>> mmNewSecuritiesToUnderlyingSecurities = new MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmNewSecuritiesToUnderlyingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NewSctiesToUndrlygScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewSecuritiesToUnderlyingSecurities";
			definition = "Quantity of new equities that will be derived by the exercise of a given quantity of intermediate securities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat2Choice.mmObject();
		}

		@Override
		public Optional<RatioFormat2Choice> getValue(CorporateActionRate2 obj) {
			return obj.getNewSecuritiesToUnderlyingSecurities();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RatioFormat2Choice> value) {
			obj.setNewSecuritiesToUnderlyingSecurities(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlQtyForExstgScties")
	protected RatioFormat1Choice additionalQuantityForExistingSecurities;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat1Choice>> mmAdditionalQuantityForExistingSecurities = new MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForExistingSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForExstgScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForExistingSecurities";
			definition = "Quantity of additional securities for a given quantity of underlying securities where underlying securities are not exchanged or debited, eg, 1 for 1: 1 new\nequity credited for every 1 underlying equity = 2 resulting equities.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat1Choice.mmObject();
		}

		@Override
		public Optional<RatioFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getAdditionalQuantityForExistingSecurities();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RatioFormat1Choice> value) {
			obj.setAdditionalQuantityForExistingSecurities(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlQtyForSbcbdRsltntScties")
	protected RatioFormat1Choice additionalQuantityForSubscribedResultantSecurities;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat1Choice>> mmAdditionalQuantityForSubscribedResultantSecurities = new MMMessageAttribute<CorporateActionRate2, Optional<RatioFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesProceedsDefinition.mmAdditionalQuantityForSubscribedResultantSecurities;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlQtyForSbcbdRsltntScties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalQuantityForSubscribedResultantSecurities";
			definition = "Quantity of additional intermediate securities/new equities awarded for a given quantity of securities derived from subscription.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RatioFormat1Choice.mmObject();
		}

		@Override
		public Optional<RatioFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getAdditionalQuantityForSubscribedResultantSecurities();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RatioFormat1Choice> value) {
			obj.setAdditionalQuantityForSubscribedResultantSecurities(value.orElse(null));
		}
	};
	@XmlElement(name = "RltdTax")
	protected RelatedTaxType1 relatedTax;
	/**
	 * 
	 <p>
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
	 * "Percentage of the gross dividend rate on which tax must be paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RelatedTaxType1>> mmRelatedTax = new MMMessageAttribute<CorporateActionRate2, Optional<RelatedTaxType1>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRelatedSecurityTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "RltdTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedTax";
			definition = "Percentage of the gross dividend rate on which tax must be paid.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RelatedTaxType1.mmObject();
		}

		@Override
		public Optional<RelatedTaxType1> getValue(CorporateActionRate2 obj) {
			return obj.getRelatedTax();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RelatedTaxType1> value) {
			obj.setRelatedTax(value.orElse(null));
		}
	};
	@XmlElement(name = "NonResdtRate")
	protected RateAndAmountFormat1Choice nonResidentRate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmNonResidentRate = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NonResdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonResidentRate";
			definition = "Rate per share to which a non-resident is entitled.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getNonResidentRate();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setNonResidentRate(value.orElse(null));
		}
	};
	@XmlElement(name = "Chrgs")
	protected RateAndAmountFormat1Choice charges;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmCharges = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmCorporateActionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "Chrgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Charges";
			definition = "Rate used to calculate the amount of the charges/fees that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getCharges();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setCharges(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrstForUsdPmt")
	protected RateAndAmountFormat1Choice interestForUsedPayment;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmInterestForUsedPayment = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Interest.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "IntrstForUsdPmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestForUsedPayment";
			definition = "The actual interest rate used for the payment of the interest for the specified interest period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getInterestForUsedPayment();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setInterestForUsedPayment(value.orElse(null));
		}
	};
	@XmlElement(name = "IndxFctr")
	protected RateAndAmountFormat1Choice indexFactor;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmIndexFactor = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexFactor;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "IndxFctr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexFactor";
			definition = "Public index rate applied to the amount paid to adjust it to inflation.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getIndexFactor();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setIndexFactor(value.orElse(null));
		}
	};
	@XmlElement(name = "FullyFrnkd")
	protected RateAndAmountFormat1Choice fullyFranked;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmFullyFranked = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFullyFrankedRateAndAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FullyFrnkd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullyFranked";
			definition = "Rate resulting from a fully franked dividend paid by a company; rate includes tax credit for companies that have made sufficient tax payments during fiscal period.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getFullyFranked();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setFullyFranked(value.orElse(null));
		}
	};
	@XmlElement(name = "GrssDvdd")
	protected GrossDividendRate1Choice grossDividend;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<GrossDividendRate1Choice>> mmGrossDividend = new MMMessageAttribute<CorporateActionRate2, Optional<GrossDividendRate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmGrossDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "GrssDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossDividend";
			definition = "Cash dividend amount per equity before deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> GrossDividendRate1Choice.mmObject();
		}

		@Override
		public Optional<GrossDividendRate1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getGrossDividend();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<GrossDividendRate1Choice> value) {
			obj.setGrossDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "NetDvdd")
	protected NetDividendRate1Choice netDividend;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<NetDividendRate1Choice>> mmNetDividend = new MMMessageAttribute<CorporateActionRate2, Optional<NetDividendRate1Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmNetDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "NetDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetDividend";
			definition = "Cash dividend amount per equity after deductions or allowances have been made.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> NetDividendRate1Choice.mmObject();
		}

		@Override
		public Optional<NetDividendRate1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getNetDividend();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<NetDividendRate1Choice> value) {
			obj.setNetDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "FnlDvdd")
	protected AmountAndRateFormat2Choice finalDividend;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<AmountAndRateFormat2Choice>> mmFinalDividend = new MMMessageAttribute<CorporateActionRate2, Optional<AmountAndRateFormat2Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmFinalDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "FnlDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalDividend";
			definition = "Dividend is final.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRateFormat2Choice.mmObject();
		}

		@Override
		public Optional<AmountAndRateFormat2Choice> getValue(CorporateActionRate2 obj) {
			return obj.getFinalDividend();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<AmountAndRateFormat2Choice> value) {
			obj.setFinalDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "PrvsnlDvdd")
	protected AmountAndRateFormat2Choice provisionalDividend;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<AmountAndRateFormat2Choice>> mmProvisionalDividend = new MMMessageAttribute<CorporateActionRate2, Optional<AmountAndRateFormat2Choice>>() {
		{
			businessElementTrace_lazy = () -> Dividend.mmProvisionalDividend;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "PrvsnlDvdd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProvisionalDividend";
			definition = "Dividend is provisional.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmountAndRateFormat2Choice.mmObject();
		}

		@Override
		public Optional<AmountAndRateFormat2Choice> getValue(CorporateActionRate2 obj) {
			return obj.getProvisionalDividend();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<AmountAndRateFormat2Choice> value) {
			obj.setProvisionalDividend(value.orElse(null));
		}
	};
	@XmlElement(name = "CshIncntiv")
	protected RateFormat1Choice cashIncentive;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmCashIncentive = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CashProceedsDefinition.mmCashIncentiveAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "CshIncntiv";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashIncentive";
			definition = "Rate of the cash premium made available if the securities holder consents or participates to an event, e.g. consent fees.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getCashIncentive();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setCashIncentive(value.orElse(null));
		}
	};
	@XmlElement(name = "SlctnFee")
	protected RateFormat1Choice solicitationFee;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmSolicitationFee = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionFeesAndCharges.mmSolicitationFee;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "SlctnFee";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SolicitationFee";
			definition = "Cash rate made available in an offer in order to encourage participation in the offer.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getSolicitationFee();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setSolicitationFee(value.orElse(null));
		}
	};
	@XmlElement(name = "MaxAllwdOvrsbcpt")
	protected RateFormat1Choice maximumAllowedOversubscription;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmMaximumAllowedOversubscription = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmMaximumAllowedOverSubscription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "MaxAllwdOvrsbcpt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaximumAllowedOversubscription";
			definition = "A maximum percentage of shares available through the over subscription privilege, usually a percentage of the basic subscription shares, eg, an account owner subscribing to 100 shares may over subscribe to a maximum of 50 additional shares when the over subscription maximum is 50%.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getMaximumAllowedOversubscription();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setMaximumAllowedOversubscription(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlTax")
	protected RateAndAmountFormat1Choice additionalTax;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>> mmAdditionalTax = new MMMessageAttribute<CorporateActionRate2, Optional<RateAndAmountFormat1Choice>>() {
		{
			businessComponentTrace_lazy = () -> Tax.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AddtlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalTax";
			definition = "Rate used for additional tax that cannot be categorised.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateAndAmountFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateAndAmountFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getAdditionalTax();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateAndAmountFormat1Choice> value) {
			obj.setAdditionalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "OrgnlAmt")
	protected ActiveCurrencyAndAmount originalAmount;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<ActiveCurrencyAndAmount>> mmOriginalAmount = new MMMessageAttribute<CorporateActionRate2, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmOriginalAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "OrgnlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalAmount";
			definition = "Amount in its original currency when conversion from/into another currency has occurred.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(CorporateActionRate2 obj) {
			return obj.getOriginalAmount();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setOriginalAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "XchgRate")
	protected ForeignExchangeTerms8 exchangeRate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<CorporateActionRate2, Optional<ForeignExchangeTerms8>> mmExchangeRate = new MMMessageAssociationEnd<CorporateActionRate2, Optional<ForeignExchangeTerms8>>() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmExchangeRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "XchgRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeRate";
			definition = "Provides information about a foreign exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms8.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms8> getValue(CorporateActionRate2 obj) {
			return obj.getExchangeRate();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<ForeignExchangeTerms8> value) {
			obj.setExchangeRate(value.orElse(null));
		}
	};
	@XmlElement(name = "AplblRate")
	protected RateFormat1Choice applicableRate;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>> mmApplicableRate = new MMMessageAttribute<CorporateActionRate2, Optional<RateFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> BiddingConditions.mmApplicableRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.CorporateActionRate2.mmObject();
			isDerived = false;
			xmlTag = "AplblRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicableRate";
			definition = "Rate applicable to the event announced, eg, redemption rate for a redemption event.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> RateFormat1Choice.mmObject();
		}

		@Override
		public Optional<RateFormat1Choice> getValue(CorporateActionRate2 obj) {
			return obj.getApplicableRate();
		}

		@Override
		public void setValue(CorporateActionRate2 obj, Optional<RateFormat1Choice> value) {
			obj.setApplicableRate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CorporateActionRate2.mmWithholdingTax, com.tools20022.repository.msg.CorporateActionRate2.mmWithholdingOfForeignTax,
						com.tools20022.repository.msg.CorporateActionRate2.mmWithholdingOfLocalTax, com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax1, com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax2,
						com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax3, com.tools20022.repository.msg.CorporateActionRate2.mmGermanLocalTax4, com.tools20022.repository.msg.CorporateActionRate2.mmTaxOnIncome,
						com.tools20022.repository.msg.CorporateActionRate2.mmTaxOnProfit, com.tools20022.repository.msg.CorporateActionRate2.mmTaxReclaim, com.tools20022.repository.msg.CorporateActionRate2.mmFiscalStamp,
						com.tools20022.repository.msg.CorporateActionRate2.mmProration, com.tools20022.repository.msg.CorporateActionRate2.mmNewToOld,
						com.tools20022.repository.msg.CorporateActionRate2.mmNewSecuritiesToUnderlyingSecurities, com.tools20022.repository.msg.CorporateActionRate2.mmAdditionalQuantityForExistingSecurities,
						com.tools20022.repository.msg.CorporateActionRate2.mmAdditionalQuantityForSubscribedResultantSecurities, com.tools20022.repository.msg.CorporateActionRate2.mmRelatedTax,
						com.tools20022.repository.msg.CorporateActionRate2.mmNonResidentRate, com.tools20022.repository.msg.CorporateActionRate2.mmCharges, com.tools20022.repository.msg.CorporateActionRate2.mmInterestForUsedPayment,
						com.tools20022.repository.msg.CorporateActionRate2.mmIndexFactor, com.tools20022.repository.msg.CorporateActionRate2.mmFullyFranked, com.tools20022.repository.msg.CorporateActionRate2.mmGrossDividend,
						com.tools20022.repository.msg.CorporateActionRate2.mmNetDividend, com.tools20022.repository.msg.CorporateActionRate2.mmFinalDividend, com.tools20022.repository.msg.CorporateActionRate2.mmProvisionalDividend,
						com.tools20022.repository.msg.CorporateActionRate2.mmCashIncentive, com.tools20022.repository.msg.CorporateActionRate2.mmSolicitationFee,
						com.tools20022.repository.msg.CorporateActionRate2.mmMaximumAllowedOversubscription, com.tools20022.repository.msg.CorporateActionRate2.mmAdditionalTax,
						com.tools20022.repository.msg.CorporateActionRate2.mmOriginalAmount, com.tools20022.repository.msg.CorporateActionRate2.mmExchangeRate, com.tools20022.repository.msg.CorporateActionRate2.mmApplicableRate);
				trace_lazy = () -> CorporateActionEvent.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionRate2";
				definition = "Specifies rates.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<RateFormat1Choice> getWithholdingTax() {
		return withholdingTax == null ? Optional.empty() : Optional.of(withholdingTax);
	}

	public CorporateActionRate2 setWithholdingTax(RateFormat1Choice withholdingTax) {
		this.withholdingTax = withholdingTax;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getWithholdingOfForeignTax() {
		return withholdingOfForeignTax == null ? Optional.empty() : Optional.of(withholdingOfForeignTax);
	}

	public CorporateActionRate2 setWithholdingOfForeignTax(RateAndAmountFormat1Choice withholdingOfForeignTax) {
		this.withholdingOfForeignTax = withholdingOfForeignTax;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getWithholdingOfLocalTax() {
		return withholdingOfLocalTax == null ? Optional.empty() : Optional.of(withholdingOfLocalTax);
	}

	public CorporateActionRate2 setWithholdingOfLocalTax(RateAndAmountFormat1Choice withholdingOfLocalTax) {
		this.withholdingOfLocalTax = withholdingOfLocalTax;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getGermanLocalTax1() {
		return germanLocalTax1 == null ? Optional.empty() : Optional.of(germanLocalTax1);
	}

	public CorporateActionRate2 setGermanLocalTax1(RateAndAmountFormat1Choice germanLocalTax1) {
		this.germanLocalTax1 = germanLocalTax1;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getGermanLocalTax2() {
		return germanLocalTax2 == null ? Optional.empty() : Optional.of(germanLocalTax2);
	}

	public CorporateActionRate2 setGermanLocalTax2(RateAndAmountFormat1Choice germanLocalTax2) {
		this.germanLocalTax2 = germanLocalTax2;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getGermanLocalTax3() {
		return germanLocalTax3 == null ? Optional.empty() : Optional.of(germanLocalTax3);
	}

	public CorporateActionRate2 setGermanLocalTax3(RateAndAmountFormat1Choice germanLocalTax3) {
		this.germanLocalTax3 = germanLocalTax3;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getGermanLocalTax4() {
		return germanLocalTax4 == null ? Optional.empty() : Optional.of(germanLocalTax4);
	}

	public CorporateActionRate2 setGermanLocalTax4(RateAndAmountFormat1Choice germanLocalTax4) {
		this.germanLocalTax4 = germanLocalTax4;
		return this;
	}

	public Optional<RateFormat1Choice> getTaxOnIncome() {
		return taxOnIncome == null ? Optional.empty() : Optional.of(taxOnIncome);
	}

	public CorporateActionRate2 setTaxOnIncome(RateFormat1Choice taxOnIncome) {
		this.taxOnIncome = taxOnIncome;
		return this;
	}

	public Optional<RateFormat1Choice> getTaxOnProfit() {
		return taxOnProfit == null ? Optional.empty() : Optional.of(taxOnProfit);
	}

	public CorporateActionRate2 setTaxOnProfit(RateFormat1Choice taxOnProfit) {
		this.taxOnProfit = taxOnProfit;
		return this;
	}

	public Optional<RateFormat1Choice> getTaxReclaim() {
		return taxReclaim == null ? Optional.empty() : Optional.of(taxReclaim);
	}

	public CorporateActionRate2 setTaxReclaim(RateFormat1Choice taxReclaim) {
		this.taxReclaim = taxReclaim;
		return this;
	}

	public Optional<RateFormat1Choice> getFiscalStamp() {
		return fiscalStamp == null ? Optional.empty() : Optional.of(fiscalStamp);
	}

	public CorporateActionRate2 setFiscalStamp(RateFormat1Choice fiscalStamp) {
		this.fiscalStamp = fiscalStamp;
		return this;
	}

	public Optional<RateFormat1Choice> getProration() {
		return proration == null ? Optional.empty() : Optional.of(proration);
	}

	public CorporateActionRate2 setProration(RateFormat1Choice proration) {
		this.proration = proration;
		return this;
	}

	public Optional<RatioFormat2Choice> getNewToOld() {
		return newToOld == null ? Optional.empty() : Optional.of(newToOld);
	}

	public CorporateActionRate2 setNewToOld(RatioFormat2Choice newToOld) {
		this.newToOld = newToOld;
		return this;
	}

	public Optional<RatioFormat2Choice> getNewSecuritiesToUnderlyingSecurities() {
		return newSecuritiesToUnderlyingSecurities == null ? Optional.empty() : Optional.of(newSecuritiesToUnderlyingSecurities);
	}

	public CorporateActionRate2 setNewSecuritiesToUnderlyingSecurities(RatioFormat2Choice newSecuritiesToUnderlyingSecurities) {
		this.newSecuritiesToUnderlyingSecurities = newSecuritiesToUnderlyingSecurities;
		return this;
	}

	public Optional<RatioFormat1Choice> getAdditionalQuantityForExistingSecurities() {
		return additionalQuantityForExistingSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForExistingSecurities);
	}

	public CorporateActionRate2 setAdditionalQuantityForExistingSecurities(RatioFormat1Choice additionalQuantityForExistingSecurities) {
		this.additionalQuantityForExistingSecurities = additionalQuantityForExistingSecurities;
		return this;
	}

	public Optional<RatioFormat1Choice> getAdditionalQuantityForSubscribedResultantSecurities() {
		return additionalQuantityForSubscribedResultantSecurities == null ? Optional.empty() : Optional.of(additionalQuantityForSubscribedResultantSecurities);
	}

	public CorporateActionRate2 setAdditionalQuantityForSubscribedResultantSecurities(RatioFormat1Choice additionalQuantityForSubscribedResultantSecurities) {
		this.additionalQuantityForSubscribedResultantSecurities = additionalQuantityForSubscribedResultantSecurities;
		return this;
	}

	public Optional<RelatedTaxType1> getRelatedTax() {
		return relatedTax == null ? Optional.empty() : Optional.of(relatedTax);
	}

	public CorporateActionRate2 setRelatedTax(RelatedTaxType1 relatedTax) {
		this.relatedTax = relatedTax;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getNonResidentRate() {
		return nonResidentRate == null ? Optional.empty() : Optional.of(nonResidentRate);
	}

	public CorporateActionRate2 setNonResidentRate(RateAndAmountFormat1Choice nonResidentRate) {
		this.nonResidentRate = nonResidentRate;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getCharges() {
		return charges == null ? Optional.empty() : Optional.of(charges);
	}

	public CorporateActionRate2 setCharges(RateAndAmountFormat1Choice charges) {
		this.charges = charges;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getInterestForUsedPayment() {
		return interestForUsedPayment == null ? Optional.empty() : Optional.of(interestForUsedPayment);
	}

	public CorporateActionRate2 setInterestForUsedPayment(RateAndAmountFormat1Choice interestForUsedPayment) {
		this.interestForUsedPayment = interestForUsedPayment;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getIndexFactor() {
		return indexFactor == null ? Optional.empty() : Optional.of(indexFactor);
	}

	public CorporateActionRate2 setIndexFactor(RateAndAmountFormat1Choice indexFactor) {
		this.indexFactor = indexFactor;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getFullyFranked() {
		return fullyFranked == null ? Optional.empty() : Optional.of(fullyFranked);
	}

	public CorporateActionRate2 setFullyFranked(RateAndAmountFormat1Choice fullyFranked) {
		this.fullyFranked = fullyFranked;
		return this;
	}

	public Optional<GrossDividendRate1Choice> getGrossDividend() {
		return grossDividend == null ? Optional.empty() : Optional.of(grossDividend);
	}

	public CorporateActionRate2 setGrossDividend(GrossDividendRate1Choice grossDividend) {
		this.grossDividend = grossDividend;
		return this;
	}

	public Optional<NetDividendRate1Choice> getNetDividend() {
		return netDividend == null ? Optional.empty() : Optional.of(netDividend);
	}

	public CorporateActionRate2 setNetDividend(NetDividendRate1Choice netDividend) {
		this.netDividend = netDividend;
		return this;
	}

	public Optional<AmountAndRateFormat2Choice> getFinalDividend() {
		return finalDividend == null ? Optional.empty() : Optional.of(finalDividend);
	}

	public CorporateActionRate2 setFinalDividend(AmountAndRateFormat2Choice finalDividend) {
		this.finalDividend = finalDividend;
		return this;
	}

	public Optional<AmountAndRateFormat2Choice> getProvisionalDividend() {
		return provisionalDividend == null ? Optional.empty() : Optional.of(provisionalDividend);
	}

	public CorporateActionRate2 setProvisionalDividend(AmountAndRateFormat2Choice provisionalDividend) {
		this.provisionalDividend = provisionalDividend;
		return this;
	}

	public Optional<RateFormat1Choice> getCashIncentive() {
		return cashIncentive == null ? Optional.empty() : Optional.of(cashIncentive);
	}

	public CorporateActionRate2 setCashIncentive(RateFormat1Choice cashIncentive) {
		this.cashIncentive = cashIncentive;
		return this;
	}

	public Optional<RateFormat1Choice> getSolicitationFee() {
		return solicitationFee == null ? Optional.empty() : Optional.of(solicitationFee);
	}

	public CorporateActionRate2 setSolicitationFee(RateFormat1Choice solicitationFee) {
		this.solicitationFee = solicitationFee;
		return this;
	}

	public Optional<RateFormat1Choice> getMaximumAllowedOversubscription() {
		return maximumAllowedOversubscription == null ? Optional.empty() : Optional.of(maximumAllowedOversubscription);
	}

	public CorporateActionRate2 setMaximumAllowedOversubscription(RateFormat1Choice maximumAllowedOversubscription) {
		this.maximumAllowedOversubscription = maximumAllowedOversubscription;
		return this;
	}

	public Optional<RateAndAmountFormat1Choice> getAdditionalTax() {
		return additionalTax == null ? Optional.empty() : Optional.of(additionalTax);
	}

	public CorporateActionRate2 setAdditionalTax(RateAndAmountFormat1Choice additionalTax) {
		this.additionalTax = additionalTax;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getOriginalAmount() {
		return originalAmount == null ? Optional.empty() : Optional.of(originalAmount);
	}

	public CorporateActionRate2 setOriginalAmount(ActiveCurrencyAndAmount originalAmount) {
		this.originalAmount = originalAmount;
		return this;
	}

	public Optional<ForeignExchangeTerms8> getExchangeRate() {
		return exchangeRate == null ? Optional.empty() : Optional.of(exchangeRate);
	}

	public CorporateActionRate2 setExchangeRate(ForeignExchangeTerms8 exchangeRate) {
		this.exchangeRate = exchangeRate;
		return this;
	}

	public Optional<RateFormat1Choice> getApplicableRate() {
		return applicableRate == null ? Optional.empty() : Optional.of(applicableRate);
	}

	public CorporateActionRate2 setApplicableRate(RateFormat1Choice applicableRate) {
		this.applicableRate = applicableRate;
		return this;
	}
}