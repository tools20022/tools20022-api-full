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
import com.tools20022.repository.codeset.CorporateActionEventType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#ActiveTradingStatus
 * CorporateActionEventType3Code.ActiveTradingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Attachment
 * CorporateActionEventType3Code.Attachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#BidRepurchaseOffer
 * CorporateActionEventType3Code.BidRepurchaseOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#BonusIssue
 * CorporateActionEventType3Code.BonusIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PutRedemption
 * CorporateActionEventType3Code.PutRedemption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Bankruptcy
 * CorporateActionEventType3Code.Bankruptcy}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Change
 * CorporateActionEventType3Code.Change}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Conversion
 * CorporateActionEventType3Code.Conversion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#CompanyOption
 * CorporateActionEventType3Code.CompanyOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#DecreaseInValue
 * CorporateActionEventType3Code.DecreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Detachment
 * CorporateActionEventType3Code.Detachment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#TradingStatusDelisted
 * CorporateActionEventType3Code.TradingStatusDelisted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Drawing
 * CorporateActionEventType3Code.Drawing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#DividendReinvestment
 * CorporateActionEventType3Code.DividendReinvestment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#DutchAuction
 * CorporateActionEventType3Code.DutchAuction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#DividendOption
 * CorporateActionEventType3Code.DividendOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#ScripDividend
 * CorporateActionEventType3Code.ScripDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#StockDividend
 * CorporateActionEventType3Code.StockDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#ExchangeOffer
 * CorporateActionEventType3Code.ExchangeOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#CallOnRights
 * CorporateActionEventType3Code.CallOnRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#CallOnWarrants
 * CorporateActionEventType3Code.CallOnWarrants}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#IncreaseInValue
 * CorporateActionEventType3Code.IncreaseInValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#LiquidationDividend
 * CorporateActionEventType3Code.LiquidationDividend}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#FullCall
 * CorporateActionEventType3Code.FullCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Merger
 * CorporateActionEventType3Code.Merger}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#OddLotSalePurchase
 * CorporateActionEventType3Code.OddLotSalePurchase}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#OtherEvent
 * CorporateActionEventType3Code.OtherEvent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PariPassu
 * CorporateActionEventType3Code.PariPassu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PartialRedemptionWithNominalValueReduction
 * CorporateActionEventType3Code.PartialRedemptionWithNominalValueReduction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Prefunding
 * CorporateActionEventType3Code.Prefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PayInKind
 * CorporateActionEventType3Code.PayInKind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PlaceOfIncorporation
 * CorporateActionEventType3Code.PlaceOfIncorporation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#InstalmentCall
 * CorporateActionEventType3Code.InstalmentCall}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PrincipalAndInterestPaydown
 * CorporateActionEventType3Code.PrincipalAndInterestPaydown}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#PriorityIssue
 * CorporateActionEventType3Code.PriorityIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#FinalMaturity
 * CorporateActionEventType3Code.FinalMaturity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Redenomination
 * CorporateActionEventType3Code.Redenomination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#RemarketingAgreement
 * CorporateActionEventType3Code.RemarketingAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#RightsDistribution
 * CorporateActionEventType3Code.RightsDistribution}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#RightsIssue
 * CorporateActionEventType3Code.RightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#SmallestNegotiableUnit
 * CorporateActionEventType3Code.SmallestNegotiableUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#SpinOff
 * CorporateActionEventType3Code.SpinOff}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#StockSplit
 * CorporateActionEventType3Code.StockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#ReverseStockSplit
 * CorporateActionEventType3Code.ReverseStockSplit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#TradingStatusSuspended
 * CorporateActionEventType3Code.TradingStatusSuspended}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Tender
 * CorporateActionEventType3Code.Tender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code#Worthless
 * CorporateActionEventType3Code.Worthless}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventTypeV2Code
 * CorporateActionEventTypeV2Code}</li>
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
 * "CorporateActionEventType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the corporate action event type."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionEventType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActiveTradingStatus"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code ActiveTradingStatus = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActiveTradingStatus";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.ActiveTradingStatus.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Attachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Attachment = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Attachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Attachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidRepurchaseOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code BidRepurchaseOffer = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidRepurchaseOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.BidRepurchaseOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code BonusIssue = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.BonusIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PutRedemption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PutRedemption = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PutRedemption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PutRedemption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Bankruptcy"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Bankruptcy = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Bankruptcy";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Bankruptcy.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Change"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Change = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Change";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Change.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Conversion"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Conversion = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Conversion";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Conversion.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompanyOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code CompanyOption = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompanyOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.CompanyOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DecreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code DecreaseInValue = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DecreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.DecreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Detachment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Detachment = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Detachment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Detachment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusDelisted"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code TradingStatusDelisted = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusDelisted";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.TradingStatusDelisted.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Drawing"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Drawing = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Drawing";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Drawing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestment"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code DividendReinvestment = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestment";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.DividendReinvestment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DutchAuction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code DutchAuction = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DutchAuction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.DutchAuction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendOption"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code DividendOption = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendOption";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.DividendOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code ScripDividend = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.ScripDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code StockDividend = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.StockDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeOffer"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code ExchangeOffer = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.ExchangeOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnRights"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code CallOnRights = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnRights";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.CallOnRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CallOnWarrants"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code CallOnWarrants = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CallOnWarrants";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.CallOnWarrants.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncreaseInValue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code IncreaseInValue = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncreaseInValue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.IncreaseInValue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LiquidationDividend"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code LiquidationDividend = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LiquidationDividend";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.LiquidationDividend.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code FullCall = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.FullCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Merger"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Merger = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Merger";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Merger.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OddLotSalePurchase"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code OddLotSalePurchase = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OddLotSalePurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.OddLotSalePurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherEvent"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code OtherEvent = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherEvent";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.OtherEvent.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PariPassu"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PariPassu = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PariPassu";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PariPassu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialRedemptionWithNominalValueReduction"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PartialRedemptionWithNominalValueReduction = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialRedemptionWithNominalValueReduction";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PartialRedemptionWithNominalValueReduction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Prefunding"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Prefunding = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Prefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Prefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PayInKind"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PayInKind = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PayInKind";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PayInKind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfIncorporation"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PlaceOfIncorporation = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfIncorporation";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PlaceOfIncorporation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstalmentCall"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code InstalmentCall = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstalmentCall";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.InstalmentCall.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PrincipalAndInterestPaydown"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PrincipalAndInterestPaydown = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PrincipalAndInterestPaydown";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PrincipalAndInterestPaydown.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriorityIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code PriorityIssue = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriorityIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.PriorityIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalMaturity"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code FinalMaturity = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalMaturity";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.FinalMaturity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Redenomination"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Redenomination = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Redenomination";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Redenomination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemarketingAgreement"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code RemarketingAgreement = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemarketingAgreement";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.RemarketingAgreement.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsDistribution"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code RightsDistribution = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsDistribution";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.RightsDistribution.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsIssue"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code RightsIssue = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.RightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SmallestNegotiableUnit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code SmallestNegotiableUnit = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SmallestNegotiableUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.SmallestNegotiableUnit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SpinOff"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code SpinOff = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SpinOff";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.SpinOff.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code StockSplit = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.StockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReverseStockSplit"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code ReverseStockSplit = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReverseStockSplit";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.ReverseStockSplit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradingStatusSuspended"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code TradingStatusSuspended = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradingStatusSuspended";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.TradingStatusSuspended.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Tender"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Tender = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Tender";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Tender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType3Code
	 * CorporateActionEventType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Worthless"</li>
	 * </ul>
	 */
	public static final CorporateActionEventType3Code Worthless = new CorporateActionEventType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Worthless";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionEventType3Code.mmObject();
			codeName = CorporateActionEventTypeV2Code.Worthless.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CorporateActionEventType3Code> codesByName = new LinkedHashMap<>();

	protected CorporateActionEventType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ACTV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionEventType3Code";
				definition = "Specifies the corporate action event type.";
				trace_lazy = () -> CorporateActionEventTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionEventType3Code.ActiveTradingStatus, com.tools20022.repository.codeset.CorporateActionEventType3Code.Attachment,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.BidRepurchaseOffer, com.tools20022.repository.codeset.CorporateActionEventType3Code.BonusIssue,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.PutRedemption, com.tools20022.repository.codeset.CorporateActionEventType3Code.Bankruptcy,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Change, com.tools20022.repository.codeset.CorporateActionEventType3Code.Conversion,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.CompanyOption, com.tools20022.repository.codeset.CorporateActionEventType3Code.DecreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Detachment, com.tools20022.repository.codeset.CorporateActionEventType3Code.TradingStatusDelisted,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Drawing, com.tools20022.repository.codeset.CorporateActionEventType3Code.DividendReinvestment,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.DutchAuction, com.tools20022.repository.codeset.CorporateActionEventType3Code.DividendOption,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.ScripDividend, com.tools20022.repository.codeset.CorporateActionEventType3Code.StockDividend,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.ExchangeOffer, com.tools20022.repository.codeset.CorporateActionEventType3Code.CallOnRights,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.CallOnWarrants, com.tools20022.repository.codeset.CorporateActionEventType3Code.IncreaseInValue,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.LiquidationDividend, com.tools20022.repository.codeset.CorporateActionEventType3Code.FullCall,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Merger, com.tools20022.repository.codeset.CorporateActionEventType3Code.OddLotSalePurchase,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.OtherEvent, com.tools20022.repository.codeset.CorporateActionEventType3Code.PariPassu,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.PartialRedemptionWithNominalValueReduction, com.tools20022.repository.codeset.CorporateActionEventType3Code.Prefunding,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.PayInKind, com.tools20022.repository.codeset.CorporateActionEventType3Code.PlaceOfIncorporation,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.InstalmentCall, com.tools20022.repository.codeset.CorporateActionEventType3Code.PrincipalAndInterestPaydown,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.PriorityIssue, com.tools20022.repository.codeset.CorporateActionEventType3Code.FinalMaturity,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Redenomination, com.tools20022.repository.codeset.CorporateActionEventType3Code.RemarketingAgreement,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.RightsDistribution, com.tools20022.repository.codeset.CorporateActionEventType3Code.RightsIssue,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.SmallestNegotiableUnit, com.tools20022.repository.codeset.CorporateActionEventType3Code.SpinOff,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.StockSplit, com.tools20022.repository.codeset.CorporateActionEventType3Code.ReverseStockSplit,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.TradingStatusSuspended, com.tools20022.repository.codeset.CorporateActionEventType3Code.Tender,
						com.tools20022.repository.codeset.CorporateActionEventType3Code.Worthless);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ActiveTradingStatus.getCodeName().get(), ActiveTradingStatus);
		codesByName.put(Attachment.getCodeName().get(), Attachment);
		codesByName.put(BidRepurchaseOffer.getCodeName().get(), BidRepurchaseOffer);
		codesByName.put(BonusIssue.getCodeName().get(), BonusIssue);
		codesByName.put(PutRedemption.getCodeName().get(), PutRedemption);
		codesByName.put(Bankruptcy.getCodeName().get(), Bankruptcy);
		codesByName.put(Change.getCodeName().get(), Change);
		codesByName.put(Conversion.getCodeName().get(), Conversion);
		codesByName.put(CompanyOption.getCodeName().get(), CompanyOption);
		codesByName.put(DecreaseInValue.getCodeName().get(), DecreaseInValue);
		codesByName.put(Detachment.getCodeName().get(), Detachment);
		codesByName.put(TradingStatusDelisted.getCodeName().get(), TradingStatusDelisted);
		codesByName.put(Drawing.getCodeName().get(), Drawing);
		codesByName.put(DividendReinvestment.getCodeName().get(), DividendReinvestment);
		codesByName.put(DutchAuction.getCodeName().get(), DutchAuction);
		codesByName.put(DividendOption.getCodeName().get(), DividendOption);
		codesByName.put(ScripDividend.getCodeName().get(), ScripDividend);
		codesByName.put(StockDividend.getCodeName().get(), StockDividend);
		codesByName.put(ExchangeOffer.getCodeName().get(), ExchangeOffer);
		codesByName.put(CallOnRights.getCodeName().get(), CallOnRights);
		codesByName.put(CallOnWarrants.getCodeName().get(), CallOnWarrants);
		codesByName.put(IncreaseInValue.getCodeName().get(), IncreaseInValue);
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
		codesByName.put(PrincipalAndInterestPaydown.getCodeName().get(), PrincipalAndInterestPaydown);
		codesByName.put(PriorityIssue.getCodeName().get(), PriorityIssue);
		codesByName.put(FinalMaturity.getCodeName().get(), FinalMaturity);
		codesByName.put(Redenomination.getCodeName().get(), Redenomination);
		codesByName.put(RemarketingAgreement.getCodeName().get(), RemarketingAgreement);
		codesByName.put(RightsDistribution.getCodeName().get(), RightsDistribution);
		codesByName.put(RightsIssue.getCodeName().get(), RightsIssue);
		codesByName.put(SmallestNegotiableUnit.getCodeName().get(), SmallestNegotiableUnit);
		codesByName.put(SpinOff.getCodeName().get(), SpinOff);
		codesByName.put(StockSplit.getCodeName().get(), StockSplit);
		codesByName.put(ReverseStockSplit.getCodeName().get(), ReverseStockSplit);
		codesByName.put(TradingStatusSuspended.getCodeName().get(), TradingStatusSuspended);
		codesByName.put(Tender.getCodeName().get(), Tender);
		codesByName.put(Worthless.getCodeName().get(), Worthless);
	}

	public static CorporateActionEventType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionEventType3Code[] values() {
		CorporateActionEventType3Code[] values = new CorporateActionEventType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionEventType3Code> {
		@Override
		public CorporateActionEventType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionEventType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}