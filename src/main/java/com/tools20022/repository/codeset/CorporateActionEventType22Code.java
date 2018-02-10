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

package com.tools20022.repository.codeset;

import com.tools20022.metamodel.MMCode;
import com.tools20022.metamodel.MMCodeSet;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.CorporateActionEventType22Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ActiveTradingStatus
 * CorporateActionEventType22Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Attachment
 * CorporateActionEventType22Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Bankruptcy
 * CorporateActionEventType22Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#BondDefault
 * CorporateActionEventType22Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#BonusIssue
 * CorporateActionEventType22Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CallOnIntermediateSecurities
 * CorporateActionEventType22Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CapitalDistribution
 * CorporateActionEventType22Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CapitalGainsDistribution
 * CorporateActionEventType22Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Capitalisation
 * CorporateActionEventType22Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType22Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CashDividend
 * CorporateActionEventType22Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Change
 * CorporateActionEventType22Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CompanyOption
 * CorporateActionEventType22Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ClassActionProposedSettlement
 * CorporateActionEventType22Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Consent
 * CorporateActionEventType22Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Conversion
 * CorporateActionEventType22Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#CreditEvent
 * CorporateActionEventType22Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DecreaseInValue
 * CorporateActionEventType22Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Detachment
 * CorporateActionEventType22Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Disclosure
 * CorporateActionEventType22Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DividendOption
 * CorporateActionEventType22Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DividendReinvestment
 * CorporateActionEventType22Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Drawing
 * CorporateActionEventType22Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#DutchAuction
 * CorporateActionEventType22Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Exchange
 * CorporateActionEventType22Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#FinalMaturity
 * CorporateActionEventType22Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#FullCall
 * CorporateActionEventType22Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#IncreaseInValue
 * CorporateActionEventType22Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InstalmentCall
 * CorporateActionEventType22Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InterestPayment
 * CorporateActionEventType22Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#InterestPaymentWithPrincipal
 * CorporateActionEventType22Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType22Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#LiquidationDividend
 * CorporateActionEventType22Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#MaturityExtension
 * CorporateActionEventType22Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Merger
 * CorporateActionEventType22Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#NonOfficialOffer
 * CorporateActionEventType22Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#NonUSTEFRADCertification
 * CorporateActionEventType22Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#OddLotSalePurchase
 * CorporateActionEventType22Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#OtherEvent
 * CorporateActionEventType22Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PariPassu
 * CorporateActionEventType22Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType22Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType22Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PayInKind
 * CorporateActionEventType22Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PlaceOfIncorporation
 * CorporateActionEventType22Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Prefunding
 * CorporateActionEventType22Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PriorityIssue
 * CorporateActionEventType22Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#PutRedemption
 * CorporateActionEventType22Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Redenomination
 * CorporateActionEventType22Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RemarketingAgreement
 * CorporateActionEventType22Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RepurchaseOffer
 * CorporateActionEventType22Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ReverseStockSplit
 * CorporateActionEventType22Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#RightsIssue
 * CorporateActionEventType22Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#ScripDividend
 * CorporateActionEventType22Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SharesPremiumDividend
 * CorporateActionEventType22Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SmallestNegotiableUnit
 * CorporateActionEventType22Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#SpinOff
 * CorporateActionEventType22Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#StockDividend
 * CorporateActionEventType22Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#StockSplit
 * CorporateActionEventType22Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TaxReclaim
 * CorporateActionEventType22Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Tender
 * CorporateActionEventType22Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TradingStatusDelisted
 * CorporateActionEventType22Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#TradingStatusSuspended
 * CorporateActionEventType22Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#WarrantExercise
 * CorporateActionEventType22Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#WithholdingTaxReliefCertification
 * CorporateActionEventType22Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Worthless
 * CorporateActionEventType22Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Accumulation
 * CorporateActionEventType22Code.Accumulation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code#Information
 * CorporateActionEventType22Code.Information}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV6Code
 * CorporateActionEventTypeV6Code}</li>
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
 * "CorporateActionEventType22Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType22Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ActiveTradingStatus = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Attachment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Bankruptcy = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code BondDefault = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code BonusIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CallOnIntermediateSecurities = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CapitalDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CapitalGainsDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Capitalisation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CashDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Change = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CompanyOption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ClassActionProposedSettlement = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Consent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Conversion = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code CreditEvent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DecreaseInValue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Detachment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Disclosure = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DividendOption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DividendReinvestment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Drawing = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code DutchAuction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Exchange = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code FinalMaturity = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code FullCall = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code IncreaseInValue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InstalmentCall = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InterestPayment = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code InterestPaymentWithPrincipal = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code IntermediateSecuritiesDistribution = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code LiquidationDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code MaturityExtension = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Merger = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code NonOfficialOffer = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code NonUSTEFRADCertification = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code OddLotSalePurchase = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code OtherEvent = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PariPassu = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutPoolFactorReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithPoolFactorReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PayInKind = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PlaceOfIncorporation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Prefunding = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PriorityIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code PutRedemption = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Redenomination = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RemarketingAgreement = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RepurchaseOffer = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ReverseStockSplit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code RightsIssue = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code ScripDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SharesPremiumDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SmallestNegotiableUnit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code SpinOff = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code StockDividend = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code StockSplit = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TaxReclaim = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Tender = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TradingStatusDelisted = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code TradingStatusSuspended = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code WarrantExercise = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code WithholdingTaxReliefCertification = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Worthless = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Accumulation = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType22Code
	 * CorporateActionEventType22Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Information"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType22Code Information = new CorporateActionEventType22Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Information";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType22Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Information.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType22Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType22Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType22Code";
				definition = "Specifies the corporate action event type.";
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType22Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType22Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType22Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType22Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType22Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType22Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType22Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType22Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType22Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType22Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType22Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType22Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType22Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType22Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType22Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType22Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType22Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType22Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType22Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType22Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType22Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType22Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType22Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType22Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType22Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType22Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType22Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType22Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType22Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType22Code.Accumulation, com.tools20022.repository.codeset.CorporateActionEventType22Code.Information);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(CallOnIntermediateSecurities.getCodeName().get(), CallOnIntermediateSecurities);
		codesByName.put(CapitalDistribution.getCodeName().get(), CapitalDistribution);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
		codesByName.put(CashDistributionFromNonEligibleSecuritiesSales.getCodeName().get(), CashDistributionFromNonEligibleSecuritiesSales);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(CreditEvent.getCodeName().get(), CreditEvent);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(InterestPaymentWithPrincipal.getCodeName().get(), InterestPaymentWithPrincipal);
		codesByName.put(IntermediateSecuritiesDistribution.getCodeName().get(), IntermediateSecuritiesDistribution);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(NonOfficialOffer.getCodeName().get(), NonOfficialOffer);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithoutPoolFactorReduction.getCodeName().get(), PartialRedemptionWithoutPoolFactorReduction);
		codesByName.put(PartialRedemptionWithPoolFactorReduction.getCodeName().get(), PartialRedemptionWithPoolFactorReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(WarrantExercise.getCodeName().get(), WarrantExercise);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
		codesByName.put(Information.getCodeName().get(), Information);
	}

	public static CorporateActionEventType22Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType22Code[] values() {
		CorporateActionEventType22Code[] values = new CorporateActionEventType22Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType22Code> {
		@Override
		public CorporateActionEventType22Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType22Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}