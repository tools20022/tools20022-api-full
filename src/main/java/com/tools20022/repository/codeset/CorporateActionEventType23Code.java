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
import com.tools20022.repository.codeset.CorporateActionEventType23Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#ActiveTradingStatus
 * CorporateActionEventType23Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Attachment
 * CorporateActionEventType23Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Bankruptcy
 * CorporateActionEventType23Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#BondDefault
 * CorporateActionEventType23Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#BonusIssue
 * CorporateActionEventType23Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CallOnIntermediateSecurities
 * CorporateActionEventType23Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CapitalDistribution
 * CorporateActionEventType23Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CapitalGainsDistribution
 * CorporateActionEventType23Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Capitalisation
 * CorporateActionEventType23Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType23Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CashDividend
 * CorporateActionEventType23Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Change
 * CorporateActionEventType23Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CompanyOption
 * CorporateActionEventType23Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#ClassActionProposedSettlement
 * CorporateActionEventType23Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Consent
 * CorporateActionEventType23Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Conversion
 * CorporateActionEventType23Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#CreditEvent
 * CorporateActionEventType23Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#DecreaseInValue
 * CorporateActionEventType23Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Detachment
 * CorporateActionEventType23Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Disclosure
 * CorporateActionEventType23Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#DividendOption
 * CorporateActionEventType23Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#DividendReinvestment
 * CorporateActionEventType23Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Drawing
 * CorporateActionEventType23Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#DutchAuction
 * CorporateActionEventType23Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Exchange
 * CorporateActionEventType23Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#FinalMaturity
 * CorporateActionEventType23Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#FullCall
 * CorporateActionEventType23Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#IncreaseInValue
 * CorporateActionEventType23Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#InstalmentCall
 * CorporateActionEventType23Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#InterestPayment
 * CorporateActionEventType23Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#InterestPaymentWithPrincipal
 * CorporateActionEventType23Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType23Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#LiquidationDividend
 * CorporateActionEventType23Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#MaturityExtension
 * CorporateActionEventType23Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Merger
 * CorporateActionEventType23Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#NonOfficialOffer
 * CorporateActionEventType23Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#NonUSTEFRADCertification
 * CorporateActionEventType23Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#OddLotSalePurchase
 * CorporateActionEventType23Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#OtherEvent
 * CorporateActionEventType23Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PariPassu
 * CorporateActionEventType23Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PartialRedemptionWithoutPoolFactorReduction
 * CorporateActionEventType23Code.PartialRedemptionWithoutPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PartialRedemptionWithPoolFactorReduction
 * CorporateActionEventType23Code.PartialRedemptionWithPoolFactorReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PayInKind
 * CorporateActionEventType23Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PlaceOfIncorporation
 * CorporateActionEventType23Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Prefunding
 * CorporateActionEventType23Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PriorityIssue
 * CorporateActionEventType23Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#PutRedemption
 * CorporateActionEventType23Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Redenomination
 * CorporateActionEventType23Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#RemarketingAgreement
 * CorporateActionEventType23Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#RepurchaseOffer
 * CorporateActionEventType23Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#ReverseStockSplit
 * CorporateActionEventType23Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#RightsIssue
 * CorporateActionEventType23Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#ScripDividend
 * CorporateActionEventType23Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#SharesPremiumDividend
 * CorporateActionEventType23Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#SmallestNegotiableUnit
 * CorporateActionEventType23Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#SpinOff
 * CorporateActionEventType23Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#StockDividend
 * CorporateActionEventType23Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#StockSplit
 * CorporateActionEventType23Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#TaxReclaim
 * CorporateActionEventType23Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Tender
 * CorporateActionEventType23Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#TradingStatusDelisted
 * CorporateActionEventType23Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#TradingStatusSuspended
 * CorporateActionEventType23Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#WarrantExercise
 * CorporateActionEventType23Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#WithholdingTaxReliefCertification
 * CorporateActionEventType23Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Worthless
 * CorporateActionEventType23Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code#Accumulation
 * CorporateActionEventType23Code.Accumulation}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventType23Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code
 * CorporateActionEventType27Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType23Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#ActiveTradingStatus
	 * CorporateActionEventType27Code.ActiveTradingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code ActiveTradingStatus = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.ActiveTradingStatus);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Attachment
	 * CorporateActionEventType27Code.Attachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Attachment = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Attachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Bankruptcy
	 * CorporateActionEventType27Code.Bankruptcy}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Bankruptcy = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Bankruptcy);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#BondDefault
	 * CorporateActionEventType27Code.BondDefault}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code BondDefault = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.BondDefault);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#BonusIssue
	 * CorporateActionEventType27Code.BonusIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code BonusIssue = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.BonusIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CallOnIntermediateSecurities
	 * CorporateActionEventType27Code.CallOnIntermediateSecurities}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CallOnIntermediateSecurities = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CallOnIntermediateSecurities);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CapitalDistribution
	 * CorporateActionEventType27Code.CapitalDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CapitalDistribution = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CapitalDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CapitalGainsDistribution
	 * CorporateActionEventType27Code.CapitalGainsDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CapitalGainsDistribution = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CapitalGainsDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Capitalisation
	 * CorporateActionEventType27Code.Capitalisation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Capitalisation = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Capitalisation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CashDistributionFromNonEligibleSecuritiesSales
	 * CorporateActionEventType27Code.
	 * CashDistributionFromNonEligibleSecuritiesSales}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CashDistributionFromNonEligibleSecuritiesSales);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CashDividend
	 * CorporateActionEventType27Code.CashDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CashDividend = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CashDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Change
	 * CorporateActionEventType27Code.Change}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Change = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Change);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CompanyOption
	 * CorporateActionEventType27Code.CompanyOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CompanyOption = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CompanyOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#ClassActionProposedSettlement
	 * CorporateActionEventType27Code.ClassActionProposedSettlement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code ClassActionProposedSettlement = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.ClassActionProposedSettlement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Consent
	 * CorporateActionEventType27Code.Consent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Consent = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Consent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Conversion
	 * CorporateActionEventType27Code.Conversion}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Conversion = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Conversion);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#CreditEvent
	 * CorporateActionEventType27Code.CreditEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code CreditEvent = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.CreditEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#DecreaseInValue
	 * CorporateActionEventType27Code.DecreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code DecreaseInValue = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.DecreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Detachment
	 * CorporateActionEventType27Code.Detachment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Detachment = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Detachment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Disclosure
	 * CorporateActionEventType27Code.Disclosure}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Disclosure = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Disclosure);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#DividendOption
	 * CorporateActionEventType27Code.DividendOption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code DividendOption = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.DividendOption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#DividendReinvestment
	 * CorporateActionEventType27Code.DividendReinvestment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code DividendReinvestment = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.DividendReinvestment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Drawing
	 * CorporateActionEventType27Code.Drawing}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Drawing = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Drawing);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#DutchAuction
	 * CorporateActionEventType27Code.DutchAuction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code DutchAuction = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.DutchAuction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Exchange
	 * CorporateActionEventType27Code.Exchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Exchange = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Exchange);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#FinalMaturity
	 * CorporateActionEventType27Code.FinalMaturity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code FinalMaturity = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.FinalMaturity);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#FullCall
	 * CorporateActionEventType27Code.FullCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code FullCall = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.FullCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#IncreaseInValue
	 * CorporateActionEventType27Code.IncreaseInValue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code IncreaseInValue = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.IncreaseInValue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#InstalmentCall
	 * CorporateActionEventType27Code.InstalmentCall}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code InstalmentCall = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.InstalmentCall);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#InterestPayment
	 * CorporateActionEventType27Code.InterestPayment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code InterestPayment = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.InterestPayment);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#InterestPaymentWithPrincipal
	 * CorporateActionEventType27Code.InterestPaymentWithPrincipal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code InterestPaymentWithPrincipal = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.InterestPaymentWithPrincipal);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#IntermediateSecuritiesDistribution
	 * CorporateActionEventType27Code.IntermediateSecuritiesDistribution}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code IntermediateSecuritiesDistribution = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.IntermediateSecuritiesDistribution);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#LiquidationDividend
	 * CorporateActionEventType27Code.LiquidationDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code LiquidationDividend = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.LiquidationDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#MaturityExtension
	 * CorporateActionEventType27Code.MaturityExtension}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code MaturityExtension = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.MaturityExtension);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Merger
	 * CorporateActionEventType27Code.Merger}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Merger = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Merger);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#NonOfficialOffer
	 * CorporateActionEventType27Code.NonOfficialOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code NonOfficialOffer = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.NonOfficialOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#NonUSTEFRADCertification
	 * CorporateActionEventType27Code.NonUSTEFRADCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code NonUSTEFRADCertification = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.NonUSTEFRADCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#OddLotSalePurchase
	 * CorporateActionEventType27Code.OddLotSalePurchase}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code OddLotSalePurchase = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.OddLotSalePurchase);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#OtherEvent
	 * CorporateActionEventType27Code.OtherEvent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code OtherEvent = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.OtherEvent);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PariPassu
	 * CorporateActionEventType27Code.PariPassu}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PariPassu = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PariPassu);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PartialRedemptionWithoutPoolFactorReduction
	 * CorporateActionEventType27Code.
	 * PartialRedemptionWithoutPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PartialRedemptionWithoutPoolFactorReduction = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PartialRedemptionWithoutPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithoutPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithPoolFactorReduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PartialRedemptionWithPoolFactorReduction
	 * CorporateActionEventType27Code.PartialRedemptionWithPoolFactorReduction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PartialRedemptionWithPoolFactorReduction = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithPoolFactorReduction";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PartialRedemptionWithPoolFactorReduction);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PartialRedemptionWithPoolFactorReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PayInKind
	 * CorporateActionEventType27Code.PayInKind}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PayInKind = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PayInKind);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PlaceOfIncorporation
	 * CorporateActionEventType27Code.PlaceOfIncorporation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PlaceOfIncorporation = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PlaceOfIncorporation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Prefunding
	 * CorporateActionEventType27Code.Prefunding}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Prefunding = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Prefunding);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PriorityIssue
	 * CorporateActionEventType27Code.PriorityIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PriorityIssue = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PriorityIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#PutRedemption
	 * CorporateActionEventType27Code.PutRedemption}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code PutRedemption = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.PutRedemption);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Redenomination
	 * CorporateActionEventType27Code.Redenomination}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Redenomination = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Redenomination);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#RemarketingAgreement
	 * CorporateActionEventType27Code.RemarketingAgreement}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code RemarketingAgreement = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.RemarketingAgreement);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#RepurchaseOffer
	 * CorporateActionEventType27Code.RepurchaseOffer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code RepurchaseOffer = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.RepurchaseOffer);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#ReverseStockSplit
	 * CorporateActionEventType27Code.ReverseStockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code ReverseStockSplit = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.ReverseStockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#RightsIssue
	 * CorporateActionEventType27Code.RightsIssue}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code RightsIssue = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.RightsIssue);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#ScripDividend
	 * CorporateActionEventType27Code.ScripDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code ScripDividend = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.ScripDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#SharesPremiumDividend
	 * CorporateActionEventType27Code.SharesPremiumDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code SharesPremiumDividend = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.SharesPremiumDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#SmallestNegotiableUnit
	 * CorporateActionEventType27Code.SmallestNegotiableUnit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code SmallestNegotiableUnit = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.SmallestNegotiableUnit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#SpinOff
	 * CorporateActionEventType27Code.SpinOff}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code SpinOff = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.SpinOff);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#StockDividend
	 * CorporateActionEventType27Code.StockDividend}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code StockDividend = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.StockDividend);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#StockSplit
	 * CorporateActionEventType27Code.StockSplit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code StockSplit = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.StockSplit);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#TaxReclaim
	 * CorporateActionEventType27Code.TaxReclaim}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code TaxReclaim = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.TaxReclaim);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Tender
	 * CorporateActionEventType27Code.Tender}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Tender = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Tender);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#TradingStatusDelisted
	 * CorporateActionEventType27Code.TradingStatusDelisted}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code TradingStatusDelisted = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.TradingStatusDelisted);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#TradingStatusSuspended
	 * CorporateActionEventType27Code.TradingStatusSuspended}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code TradingStatusSuspended = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.TradingStatusSuspended);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#WarrantExercise
	 * CorporateActionEventType27Code.WarrantExercise}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code WarrantExercise = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.WarrantExercise);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#WithholdingTaxReliefCertification
	 * CorporateActionEventType27Code.WithholdingTaxReliefCertification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code WithholdingTaxReliefCertification = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.WithholdingTaxReliefCertification);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Worthless
	 * CorporateActionEventType27Code.Worthless}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Worthless = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Worthless);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType23Code
	 * CorporateActionEventType23Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType27Code#Accumulation
	 * CorporateActionEventType27Code.Accumulation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final CorporateActionEventType23Code Accumulation = new CorporateActionEventType23Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.Accumulation);
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType23Code.mmObject();
			codeName = CorporateActionEventTypeV6Code.Accumulation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType23Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType23Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType23Code";
				definition = "Specifies the corporate action event type.";
				nextVersions_lazy = () -> Arrays.asList(CorporateActionEventType27Code.mmObject());
				trace_lazy = () -> CorporateActionEventTypeV6Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType23Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType23Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType23Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType23Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType23Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType23Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType23Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType23Code.ClassActionProposedSettlement,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType23Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType23Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType23Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType23Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType23Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType23Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType23Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType23Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType23Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType23Code.MaturityExtension,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType23Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType23Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType23Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.PartialRedemptionWithoutPoolFactorReduction,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.PartialRedemptionWithPoolFactorReduction, com.tools20022.repository.codeset.CorporateActionEventType23Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType23Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType23Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType23Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType23Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType23Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType23Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType23Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType23Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType23Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType23Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.WithholdingTaxReliefCertification, com.tools20022.repository.codeset.CorporateActionEventType23Code.Worthless,
						com.tools20022.repository.codeset.CorporateActionEventType23Code.Accumulation);
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
	}

	public static CorporateActionEventType23Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType23Code[] values() {
		CorporateActionEventType23Code[] values = new CorporateActionEventType23Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType23Code> {
		@Override
		public CorporateActionEventType23Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType23Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}