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
import com.tools20022.repository.codeset.CorporateActionEventType8Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of a corporate action event.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#ActiveTradingStatus
 * CorporateActionEventType8Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Attachment
 * CorporateActionEventType8Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#RepurchaseOffer
 * CorporateActionEventType8Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#BonusIssue
 * CorporateActionEventType8Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PutRedemption
 * CorporateActionEventType8Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Bankruptcy
 * CorporateActionEventType8Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CapitalGainsDistribution
 * CorporateActionEventType8Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Capitalisation
 * CorporateActionEventType8Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#NonUSTEFRADCertification
 * CorporateActionEventType8Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Change
 * CorporateActionEventType8Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#ClassActionProposedSettlement
 * CorporateActionEventType8Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Consent
 * CorporateActionEventType8Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Conversion
 * CorporateActionEventType8Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CompanyOption
 * CorporateActionEventType8Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#DecreaseInValue
 * CorporateActionEventType8Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Detachment
 * CorporateActionEventType8Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#BondDefault
 * CorporateActionEventType8Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#TradingStatusDelisted
 * CorporateActionEventType8Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Drawing
 * CorporateActionEventType8Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#DividendReinvestment
 * CorporateActionEventType8Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Disclosure
 * CorporateActionEventType8Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#DutchAuction
 * CorporateActionEventType8Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CashDividend
 * CorporateActionEventType8Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#DividendOption
 * CorporateActionEventType8Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#ScripDividend
 * CorporateActionEventType8Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#StockDividend
 * CorporateActionEventType8Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Exchange
 * CorporateActionEventType8Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CallOnIntermediateSecurities
 * CorporateActionEventType8Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#MaturityExtension
 * CorporateActionEventType8Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#WarrantExercise
 * CorporateActionEventType8Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CapitalDistribution
 * CorporateActionEventType8Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#IncreaseInValue
 * CorporateActionEventType8Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#InterestPayment
 * CorporateActionEventType8Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#LiquidationDividend
 * CorporateActionEventType8Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#FullCall
 * CorporateActionEventType8Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Merger
 * CorporateActionEventType8Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#OddLotSalePurchase
 * CorporateActionEventType8Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#OtherEvent
 * CorporateActionEventType8Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PariPassu
 * CorporateActionEventType8Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PartialRedemptionWithNominalValueReduction
 * CorporateActionEventType8Code.PartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Prefunding
 * CorporateActionEventType8Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PayInKind
 * CorporateActionEventType8Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PlaceOfIncorporation
 * CorporateActionEventType8Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#InstalmentCall
 * CorporateActionEventType8Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PartialRedemptionWithoutNominalValueReduction
 * CorporateActionEventType8Code.PartialRedemptionWithoutNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#InterestPaymentWithPrincipal
 * CorporateActionEventType8Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#PriorityIssue
 * CorporateActionEventType8Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#FinalMaturity
 * CorporateActionEventType8Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Redenomination
 * CorporateActionEventType8Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#RemarketingAgreement
 * CorporateActionEventType8Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType8Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#RightsIssue
 * CorporateActionEventType8Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#SharesPremiumDividend
 * CorporateActionEventType8Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#SmallestNegotiableUnit
 * CorporateActionEventType8Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#SpinOff
 * CorporateActionEventType8Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#StockSplit
 * CorporateActionEventType8Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#ReverseStockSplit
 * CorporateActionEventType8Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#TradingStatusSuspended
 * CorporateActionEventType8Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Tender
 * CorporateActionEventType8Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#TaxReclaim
 * CorporateActionEventType8Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#Worthless
 * CorporateActionEventType8Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#WithholdingTaxReliefCertification
 * CorporateActionEventType8Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CreditEvent
 * CorporateActionEventType8Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType8Code.CashDistributionFromNonEligibleSecuritiesSales}
 * </li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV3Code
 * CorporateActionEventTypeV3Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"ACTV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionEventType8Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a corporate action event."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType6Code
 * CorporateActionEventType6Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType8Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code ActiveTradingStatus = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Attachment = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code RepurchaseOffer = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code BonusIssue = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PutRedemption = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Bankruptcy = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CapitalGainsDistribution = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Capitalisation = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code NonUSTEFRADCertification = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Change = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code ClassActionProposedSettlement = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Consent = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Conversion = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CompanyOption = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code DecreaseInValue = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Detachment = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code BondDefault = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code TradingStatusDelisted = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Drawing = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code DividendReinvestment = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Disclosure = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code DutchAuction = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CashDividend = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code DividendOption = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code ScripDividend = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code StockDividend = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Exchange = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CallOnIntermediateSecurities = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code MaturityExtension = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code WarrantExercise = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CapitalDistribution = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code IncreaseInValue = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code InterestPayment = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code LiquidationDividend = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code FullCall = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Merger = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code OddLotSalePurchase = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code OtherEvent = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PariPassu = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithNominalValueReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PartialRedemptionWithNominalValueReduction = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PartialRedemptionWithNominalValueReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Prefunding = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PayInKind = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PlaceOfIncorporation = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code InstalmentCall = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutNominalValueReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PartialRedemptionWithoutNominalValueReduction = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutNominalValueReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PartialRedemptionWithoutNominalValueReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code InterestPaymentWithPrincipal = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code PriorityIssue = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code FinalMaturity = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Redenomination = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code RemarketingAgreement = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code IntermediateSecuritiesDistribution = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code RightsIssue = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code SharesPremiumDividend = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code SmallestNegotiableUnit = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code SpinOff = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code StockSplit = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code ReverseStockSplit = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code TradingStatusSuspended = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Tender = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code TaxReclaim = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code Worthless = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code WithholdingTaxReliefCertification = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CreditEvent = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType8Code
	 * CorporateActionEventType8Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType8Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType8Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType8Code.mmObject();
			codeName = CorporateActionEventTypeV3Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType8Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType8Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType8Code";
				definition = "Specifies the type of a corporate action event.";
				previousVersion_lazy = () -> CorporateActionEventType6Code.mmObject();
				trace_lazy = () -> CorporateActionEventTypeV3Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType8Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType8Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType8Code.BonusIssue,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.PutRedemption, com.tools20022.repository.codeset.CorporateActionEventType8Code.Bankruptcy,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.CapitalGainsDistribution, com.tools20022.repository.codeset.CorporateActionEventType8Code.Capitalisation,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.NonUSTEFRADCertification, com.tools20022.repository.codeset.CorporateActionEventType8Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.ClassActionProposedSettlement, com.tools20022.repository.codeset.CorporateActionEventType8Code.Consent,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Conversion, com.tools20022.repository.codeset.CorporateActionEventType8Code.CompanyOption,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.DecreaseInValue, com.tools20022.repository.codeset.CorporateActionEventType8Code.Detachment,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.BondDefault, com.tools20022.repository.codeset.CorporateActionEventType8Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType8Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Disclosure, com.tools20022.repository.codeset.CorporateActionEventType8Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType8Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.ScripDividend, com.tools20022.repository.codeset.CorporateActionEventType8Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType8Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.MaturityExtension, com.tools20022.repository.codeset.CorporateActionEventType8Code.WarrantExercise,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType8Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.InterestPayment, com.tools20022.repository.codeset.CorporateActionEventType8Code.LiquidationDividend,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType8Code.Merger,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.OddLotSalePurchase, com.tools20022.repository.codeset.CorporateActionEventType8Code.OtherEvent,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.PariPassu, com.tools20022.repository.codeset.CorporateActionEventType8Code.PartialRedemptionWithNominalValueReduction,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Prefunding, com.tools20022.repository.codeset.CorporateActionEventType8Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType8Code.InstalmentCall,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.PartialRedemptionWithoutNominalValueReduction, com.tools20022.repository.codeset.CorporateActionEventType8Code.InterestPaymentWithPrincipal,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType8Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType8Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.IntermediateSecuritiesDistribution, com.tools20022.repository.codeset.CorporateActionEventType8Code.RightsIssue,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.SharesPremiumDividend, com.tools20022.repository.codeset.CorporateActionEventType8Code.SmallestNegotiableUnit,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.SpinOff, com.tools20022.repository.codeset.CorporateActionEventType8Code.StockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.ReverseStockSplit, com.tools20022.repository.codeset.CorporateActionEventType8Code.TradingStatusSuspended,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Tender, com.tools20022.repository.codeset.CorporateActionEventType8Code.TaxReclaim,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.Worthless, com.tools20022.repository.codeset.CorporateActionEventType8Code.WithholdingTaxReliefCertification,
						com.tools20022.repository.codeset.CorporateActionEventType8Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType8Code.CashDistributionFromNonEligibleSecuritiesSales);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(CapitalGainsDistribution.getCodeName().get(), CapitalGainsDistribution);
		codesByName.put(Capitalisation.getCodeName().get(), Capitalisation);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(Consent.getCodeName().get(), Consent);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(BondDefault.getCodeName().get(), BondDefault);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(Disclosure.getCodeName().get(), Disclosure);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(CashDividend.getCodeName().get(), CashDividend);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(Exchange.getCodeName().get(), Exchange);
		codesByName.put(CallOnIntermediateSecurities.getCodeName().get(), CallOnIntermediateSecurities);
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(WarrantExercise.getCodeName().get(), WarrantExercise);
		codesByName.put(CapitalDistribution.getCodeName().get(), CapitalDistribution);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
		codesByName.put(InterestPayment.getCodeName().get(), InterestPayment);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(FullCall.getCodeName().get(), FullCall);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithNominalValueReduction.getCodeName().get(), PartialRedemptionWithNominalValueReduction);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(InstalmentCall.getCodeName().get(), InstalmentCall);
		codesByName.put(PartialRedemptionWithoutNominalValueReduction.getCodeName().get(), PartialRedemptionWithoutNominalValueReduction);
		codesByName.put(InterestPaymentWithPrincipal.getCodeName().get(), InterestPaymentWithPrincipal);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(IntermediateSecuritiesDistribution.getCodeName().get(), IntermediateSecuritiesDistribution);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(SharesPremiumDividend.getCodeName().get(), SharesPremiumDividend);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(TaxReclaim.getCodeName().get(), TaxReclaim);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
		codesByName.put(WithholdingTaxReliefCertification.getCodeName().get(), WithholdingTaxReliefCertification);
		codesByName.put(CreditEvent.getCodeName().get(), CreditEvent);
		codesByName.put(CashDistributionFromNonEligibleSecuritiesSales.getCodeName().get(), CashDistributionFromNonEligibleSecuritiesSales);
	}

	public static CorporateActionEventType8Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType8Code[] values() {
		CorporateActionEventType8Code[] values = new CorporateActionEventType8Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType8Code> {
		@Override
		public CorporateActionEventType8Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType8Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}