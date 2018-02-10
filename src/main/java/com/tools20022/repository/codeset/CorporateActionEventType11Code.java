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
import com.tools20022.repository.codeset.CorporateActionEventType11Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#ActiveTradingStatus
 * CorporateActionEventType11Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Attachment
 * CorporateActionEventType11Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Bankruptcy
 * CorporateActionEventType11Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#BondDefault
 * CorporateActionEventType11Code.BondDefault}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#BonusIssue
 * CorporateActionEventType11Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CallOnIntermediateSecurities
 * CorporateActionEventType11Code.CallOnIntermediateSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CapitalDistribution
 * CorporateActionEventType11Code.CapitalDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CapitalGainsDistribution
 * CorporateActionEventType11Code.CapitalGainsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Capitalisation
 * CorporateActionEventType11Code.Capitalisation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CashDistributionFromNonEligibleSecuritiesSales
 * CorporateActionEventType11Code.CashDistributionFromNonEligibleSecuritiesSales
 * }</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CashDividend
 * CorporateActionEventType11Code.CashDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Change
 * CorporateActionEventType11Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#ClassActionProposedSettlement
 * CorporateActionEventType11Code.ClassActionProposedSettlement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CompanyOption
 * CorporateActionEventType11Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Consent
 * CorporateActionEventType11Code.Consent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Conversion
 * CorporateActionEventType11Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#CreditEvent
 * CorporateActionEventType11Code.CreditEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#DecreaseInValue
 * CorporateActionEventType11Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Detachment
 * CorporateActionEventType11Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Disclosure
 * CorporateActionEventType11Code.Disclosure}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#DividendOption
 * CorporateActionEventType11Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#DividendReinvestment
 * CorporateActionEventType11Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Drawing
 * CorporateActionEventType11Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#DutchAuction
 * CorporateActionEventType11Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Exchange
 * CorporateActionEventType11Code.Exchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#FinalMaturity
 * CorporateActionEventType11Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#FullCall
 * CorporateActionEventType11Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#IncreaseInValue
 * CorporateActionEventType11Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#InstalmentCall
 * CorporateActionEventType11Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#InterestPayment
 * CorporateActionEventType11Code.InterestPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#InterestPaymentWithPrincipal
 * CorporateActionEventType11Code.InterestPaymentWithPrincipal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#IntermediateSecuritiesDistribution
 * CorporateActionEventType11Code.IntermediateSecuritiesDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#MaturityExtension
 * CorporateActionEventType11Code.MaturityExtension}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Merger
 * CorporateActionEventType11Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#LiquidationDividend
 * CorporateActionEventType11Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#NonUSTEFRADCertification
 * CorporateActionEventType11Code.NonUSTEFRADCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#OddLotSalePurchase
 * CorporateActionEventType11Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#OtherEvent
 * CorporateActionEventType11Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PariPassu
 * CorporateActionEventType11Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PartialRedemptionWithNominalValueReduction
 * CorporateActionEventType11Code.PartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PartialRedemptionWithoutNominalValueReduction
 * CorporateActionEventType11Code.PartialRedemptionWithoutNominalValueReduction}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PayInKind
 * CorporateActionEventType11Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PriorityIssue
 * CorporateActionEventType11Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PutRedemption
 * CorporateActionEventType11Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Redenomination
 * CorporateActionEventType11Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Prefunding
 * CorporateActionEventType11Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#PlaceOfIncorporation
 * CorporateActionEventType11Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#RemarketingAgreement
 * CorporateActionEventType11Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#RepurchaseOffer
 * CorporateActionEventType11Code.RepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#ReverseStockSplit
 * CorporateActionEventType11Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#RightsIssue
 * CorporateActionEventType11Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#ScripDividend
 * CorporateActionEventType11Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#SecuritiesHoldersMeeting
 * CorporateActionEventType11Code.SecuritiesHoldersMeeting}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#SharesPremiumDividend
 * CorporateActionEventType11Code.SharesPremiumDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#SmallestNegotiableUnit
 * CorporateActionEventType11Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#SpinOff
 * CorporateActionEventType11Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#StockDividend
 * CorporateActionEventType11Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#StockSplit
 * CorporateActionEventType11Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#TaxReclaim
 * CorporateActionEventType11Code.TaxReclaim}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Tender
 * CorporateActionEventType11Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#TradingStatusDelisted
 * CorporateActionEventType11Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#TradingStatusSuspended
 * CorporateActionEventType11Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#WarrantExercise
 * CorporateActionEventType11Code.WarrantExercise}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#WithholdingTaxReliefCertification
 * CorporateActionEventType11Code.WithholdingTaxReliefCertification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Worthless
 * CorporateActionEventType11Code.Worthless}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#NonOfficialOffer
 * CorporateActionEventType11Code.NonOfficialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code#Accumulation
 * CorporateActionEventType11Code.Accumulation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV4Code
 * CorporateActionEventTypeV4Code}</li>
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
 * "CorporateActionEventType11Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of a corporate action event."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType11Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code ActiveTradingStatus = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Attachment = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Bankruptcy = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BondDefault"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code BondDefault = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BondDefault";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.BondDefault.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code BonusIssue = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnIntermediateSecurities"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CallOnIntermediateSecurities = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnIntermediateSecurities";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CallOnIntermediateSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CapitalDistribution = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CapitalDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CapitalGainsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CapitalGainsDistribution = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CapitalGainsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CapitalGainsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capitalisation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Capitalisation = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capitalisation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Capitalisation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDistributionFromNonEligibleSecuritiesSales"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CashDistributionFromNonEligibleSecuritiesSales = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDistributionFromNonEligibleSecuritiesSales";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CashDistributionFromNonEligibleSecuritiesSales.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CashDividend = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CashDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Change = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClassActionProposedSettlement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code ClassActionProposedSettlement = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClassActionProposedSettlement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.ClassActionProposedSettlement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CompanyOption = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Consent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Consent = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Consent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Consent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Conversion = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code CreditEvent = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.CreditEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code DecreaseInValue = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Detachment = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Disclosure"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Disclosure = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Disclosure";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Disclosure.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code DividendOption = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code DividendReinvestment = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Drawing = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code DutchAuction = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Exchange"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Exchange = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Exchange";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Exchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code FinalMaturity = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code FullCall = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code IncreaseInValue = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code InstalmentCall = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPayment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code InterestPayment = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.InterestPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterestPaymentWithPrincipal"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code InterestPaymentWithPrincipal = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterestPaymentWithPrincipal";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.InterestPaymentWithPrincipal.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IntermediateSecuritiesDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code IntermediateSecuritiesDistribution = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IntermediateSecuritiesDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.IntermediateSecuritiesDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MaturityExtension"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code MaturityExtension = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MaturityExtension";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.MaturityExtension.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Merger = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code LiquidationDividend = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonUSTEFRADCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code NonUSTEFRADCertification = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonUSTEFRADCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.NonUSTEFRADCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code OddLotSalePurchase = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code OtherEvent = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PariPassu = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithNominalValueReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PartialRedemptionWithNominalValueReduction = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PartialRedemptionWithNominalValueReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithoutNominalValueReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PartialRedemptionWithoutNominalValueReduction = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithoutNominalValueReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PartialRedemptionWithoutNominalValueReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PayInKind = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PriorityIssue = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PutRedemption = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Redenomination = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Prefunding = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code PlaceOfIncorporation = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code RemarketingAgreement = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code RepurchaseOffer = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.RepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code ReverseStockSplit = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code RightsIssue = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code ScripDividend = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesHoldersMeeting"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code SecuritiesHoldersMeeting = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesHoldersMeeting";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.SecuritiesHoldersMeeting.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharesPremiumDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code SharesPremiumDividend = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharesPremiumDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.SharesPremiumDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code SmallestNegotiableUnit = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code SpinOff = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code StockDividend = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code StockSplit = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxReclaim"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code TaxReclaim = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxReclaim";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.TaxReclaim.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Tender = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code TradingStatusDelisted = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code TradingStatusSuspended = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WarrantExercise"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code WarrantExercise = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WarrantExercise";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.WarrantExercise.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxReliefCertification"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code WithholdingTaxReliefCertification = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxReliefCertification";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.WithholdingTaxReliefCertification.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Worthless = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Worthless.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonOfficialOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code NonOfficialOffer = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonOfficialOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.NonOfficialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType11Code
	 * CorporateActionEventType11Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accumulation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType11Code Accumulation = new CorporateActionEventType11Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accumulation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType11Code.mmObject();
			codeName = CorporateActionEventTypeV4Code.Accumulation.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType11Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType11Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType11Code";
				definition = "Specifies the type of a corporate action event.";
				trace_lazy = () -> CorporateActionEventTypeV4Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType11Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType11Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Bankruptcy, com.tools20022.repository.codeset.CorporateActionEventType11Code.BondDefault,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.BonusIssue, com.tools20022.repository.codeset.CorporateActionEventType11Code.CallOnIntermediateSecurities,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.CapitalDistribution, com.tools20022.repository.codeset.CorporateActionEventType11Code.CapitalGainsDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Capitalisation, com.tools20022.repository.codeset.CorporateActionEventType11Code.CashDistributionFromNonEligibleSecuritiesSales,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.CashDividend, com.tools20022.repository.codeset.CorporateActionEventType11Code.Change,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.ClassActionProposedSettlement, com.tools20022.repository.codeset.CorporateActionEventType11Code.CompanyOption,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Consent, com.tools20022.repository.codeset.CorporateActionEventType11Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.CreditEvent, com.tools20022.repository.codeset.CorporateActionEventType11Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType11Code.Disclosure,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.DividendOption, com.tools20022.repository.codeset.CorporateActionEventType11Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType11Code.DutchAuction,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Exchange, com.tools20022.repository.codeset.CorporateActionEventType11Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.FullCall, com.tools20022.repository.codeset.CorporateActionEventType11Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType11Code.InterestPayment,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.InterestPaymentWithPrincipal, com.tools20022.repository.codeset.CorporateActionEventType11Code.IntermediateSecuritiesDistribution,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.MaturityExtension, com.tools20022.repository.codeset.CorporateActionEventType11Code.Merger,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType11Code.NonUSTEFRADCertification,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.OddLotSalePurchase, com.tools20022.repository.codeset.CorporateActionEventType11Code.OtherEvent,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.PariPassu, com.tools20022.repository.codeset.CorporateActionEventType11Code.PartialRedemptionWithNominalValueReduction,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.PartialRedemptionWithoutNominalValueReduction, com.tools20022.repository.codeset.CorporateActionEventType11Code.PayInKind,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType11Code.PutRedemption,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType11Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.PlaceOfIncorporation, com.tools20022.repository.codeset.CorporateActionEventType11Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.RepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType11Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.RightsIssue, com.tools20022.repository.codeset.CorporateActionEventType11Code.ScripDividend,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.SecuritiesHoldersMeeting, com.tools20022.repository.codeset.CorporateActionEventType11Code.SharesPremiumDividend,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.SmallestNegotiableUnit, com.tools20022.repository.codeset.CorporateActionEventType11Code.SpinOff,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.StockDividend, com.tools20022.repository.codeset.CorporateActionEventType11Code.StockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.TaxReclaim, com.tools20022.repository.codeset.CorporateActionEventType11Code.Tender,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.TradingStatusDelisted, com.tools20022.repository.codeset.CorporateActionEventType11Code.TradingStatusSuspended,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.WarrantExercise, com.tools20022.repository.codeset.CorporateActionEventType11Code.WithholdingTaxReliefCertification,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Worthless, com.tools20022.repository.codeset.CorporateActionEventType11Code.NonOfficialOffer,
						com.tools20022.repository.codeset.CorporateActionEventType11Code.Accumulation);
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
		codesByName.put(ClassActionProposedSettlement.getCodeName().get(), ClassActionProposedSettlement);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
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
		codesByName.put(MaturityExtension.getCodeName().get(), MaturityExtension);
		codesByName.put(Merger.getCodeName().get(), Merger);
		codesByName.put(LiquidationDividend.getCodeName().get(), LiquidationDividend);
		codesByName.put(NonUSTEFRADCertification.getCodeName().get(), NonUSTEFRADCertification);
		codesByName.put(OddLotSalePurchase.getCodeName().get(), OddLotSalePurchase);
		codesByName.put(OtherEvent.getCodeName().get(), OtherEvent);
		codesByName.put(PariPassu.getCodeName().get(), PariPassu);
		codesByName.put(PartialRedemptionWithNominalValueReduction.getCodeName().get(), PartialRedemptionWithNominalValueReduction);
		codesByName.put(PartialRedemptionWithoutNominalValueReduction.getCodeName().get(), PartialRedemptionWithoutNominalValueReduction);
		codesByName.put(PayInKind.getCodeName().get(), PayInKind);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(Prefunding.getCodeName().get(), Prefunding);
		codesByName.put(PlaceOfIncorporation.getCodeName().get(), PlaceOfIncorporation);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RepurchaseOffer.getCodeName().get(), RepurchaseOffer);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(SecuritiesHoldersMeeting.getCodeName().get(), SecuritiesHoldersMeeting);
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
		codesByName.put(NonOfficialOffer.getCodeName().get(), NonOfficialOffer);
		codesByName.put(Accumulation.getCodeName().get(), Accumulation);
	}

	public static CorporateActionEventType11Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType11Code[] values() {
		CorporateActionEventType11Code[] values = new CorporateActionEventType11Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType11Code> {
		@Override
		public CorporateActionEventType11Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType11Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}