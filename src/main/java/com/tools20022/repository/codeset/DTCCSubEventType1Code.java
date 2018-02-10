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
import com.tools20022.repository.codeset.DTCCSubEventType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub
 * event types.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#OptOut
 * DTCCSubEventType1Code.OptOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#DividendReinvestmentByDTC
 * DTCCSubEventType1Code.DividendReinvestmentByDTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#PlaceOfListing
 * DTCCSubEventType1Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#BoardLot
 * DTCCSubEventType1Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#InterimPayment
 * DTCCSubEventType1Code.InterimPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#FinalPayment
 * DTCCSubEventType1Code.FinalPayment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Remarketing
 * DTCCSubEventType1Code.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Unwind
 * DTCCSubEventType1Code.Unwind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#AnnualGeneral
 * DTCCSubEventType1Code.AnnualGeneral}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Extraordinary
 * DTCCSubEventType1Code.Extraordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Ordinary
 * DTCCSubEventType1Code.Ordinary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Special
 * DTCCSubEventType1Code.Special}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#ShareExchange
 * DTCCSubEventType1Code.ShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Standard
 * DTCCSubEventType1Code.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#Transfer
 * DTCCSubEventType1Code.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#SurvivorOptions
 * DTCCSubEventType1Code.SurvivorOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#MortgageBacked
 * DTCCSubEventType1Code.MortgageBacked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#SaleOfAssets
 * DTCCSubEventType1Code.SaleOfAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#PhysicalRightsNotIssued
 * DTCCSubEventType1Code.PhysicalRightsNotIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#PoisonPill
 * DTCCSubEventType1Code.PoisonPill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#DividendReinvestmentByIssuer
 * DTCCSubEventType1Code.DividendReinvestmentByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#MandatoryRedemptionOfShares
 * DTCCSubEventType1Code.MandatoryRedemptionOfShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#SharePurchasePlan
 * DTCCSubEventType1Code.SharePurchasePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#OpenOffer
 * DTCCSubEventType1Code.OpenOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#TenderWithRights
 * DTCCSubEventType1Code.TenderWithRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#CashinLieu
 * DTCCSubEventType1Code.CashinLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#BidTenderSealedTender
 * DTCCSubEventType1Code.BidTenderSealedTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#OfferToPurchase
 * DTCCSubEventType1Code.OfferToPurchase}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code#ADR
 * DTCCSubEventType1Code.ADR}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventTypeCode
 * DTCCSubEventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPTO"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCSubEventType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCSubEventType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptOut"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code OptOut = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptOut";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.OptOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByDTC"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code DividendReinvestmentByDTC = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByDTC";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByDTC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code PlaceOfListing = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code BoardLot = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.BoardLot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimPayment"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code InterimPayment = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.InterimPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalPayment"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code FinalPayment = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalPayment";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.FinalPayment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Remarketing = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Remarketing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unwind"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Unwind = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unwind";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Unwind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnnualGeneral"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code AnnualGeneral = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnnualGeneral";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.AnnualGeneral.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extraordinary"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Extraordinary = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extraordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Extraordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Ordinary"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Ordinary = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Ordinary";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Ordinary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Special"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Special = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Special";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Special.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareExchange"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code ShareExchange = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.ShareExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Standard = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Standard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code Transfer = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.Transfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivorOptions"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code SurvivorOptions = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivorOptions";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.SurvivorOptions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBacked"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code MortgageBacked = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBacked";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.MortgageBacked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssets"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code SaleOfAssets = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssets";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.SaleOfAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRightsNotIssued"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code PhysicalRightsNotIssued = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRightsNotIssued";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.PhysicalRightsNotIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoisonPill"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code PoisonPill = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoisonPill";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.PoisonPill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByIssuer"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code DividendReinvestmentByIssuer = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByIssuer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryRedemptionOfShares"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code MandatoryRedemptionOfShares = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryRedemptionOfShares";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.MandatoryRedemptionOfShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharePurchasePlan"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code SharePurchasePlan = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharePurchasePlan";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.SharePurchasePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOffer"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code OpenOffer = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.OpenOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderWithRights"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code TenderWithRights = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderWithRights";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.TenderWithRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashinLieu"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code CashinLieu = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashinLieu";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.CashinLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidTenderSealedTender"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code BidTenderSealedTender = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidTenderSealedTender";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.BidTenderSealedTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferToPurchase"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code OfferToPurchase = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferToPurchase";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.OfferToPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType1Code
	 * DTCCSubEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADR"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType1Code ADR = new DTCCSubEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADR";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType1Code.mmObject();
			codeName = DTCCSubEventTypeCode.ADR.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCSubEventType1Code> codesByName = new LinkedHashMap<>();

	protected DTCCSubEventType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPTO");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DTCCSubEventType1Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types.";
				trace_lazy = () -> DTCCSubEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCSubEventType1Code.OptOut, com.tools20022.repository.codeset.DTCCSubEventType1Code.DividendReinvestmentByDTC,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.PlaceOfListing, com.tools20022.repository.codeset.DTCCSubEventType1Code.BoardLot, com.tools20022.repository.codeset.DTCCSubEventType1Code.InterimPayment,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.FinalPayment, com.tools20022.repository.codeset.DTCCSubEventType1Code.Remarketing, com.tools20022.repository.codeset.DTCCSubEventType1Code.Unwind,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.AnnualGeneral, com.tools20022.repository.codeset.DTCCSubEventType1Code.Extraordinary, com.tools20022.repository.codeset.DTCCSubEventType1Code.Ordinary,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.Special, com.tools20022.repository.codeset.DTCCSubEventType1Code.ShareExchange, com.tools20022.repository.codeset.DTCCSubEventType1Code.Standard,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.Transfer, com.tools20022.repository.codeset.DTCCSubEventType1Code.SurvivorOptions, com.tools20022.repository.codeset.DTCCSubEventType1Code.MortgageBacked,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.SaleOfAssets, com.tools20022.repository.codeset.DTCCSubEventType1Code.PhysicalRightsNotIssued,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.PoisonPill, com.tools20022.repository.codeset.DTCCSubEventType1Code.DividendReinvestmentByIssuer,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.MandatoryRedemptionOfShares, com.tools20022.repository.codeset.DTCCSubEventType1Code.SharePurchasePlan,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.OpenOffer, com.tools20022.repository.codeset.DTCCSubEventType1Code.TenderWithRights, com.tools20022.repository.codeset.DTCCSubEventType1Code.CashinLieu,
						com.tools20022.repository.codeset.DTCCSubEventType1Code.BidTenderSealedTender, com.tools20022.repository.codeset.DTCCSubEventType1Code.OfferToPurchase, com.tools20022.repository.codeset.DTCCSubEventType1Code.ADR);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OptOut.getCodeName().get(), OptOut);
		codesByName.put(DividendReinvestmentByDTC.getCodeName().get(), DividendReinvestmentByDTC);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(InterimPayment.getCodeName().get(), InterimPayment);
		codesByName.put(FinalPayment.getCodeName().get(), FinalPayment);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Unwind.getCodeName().get(), Unwind);
		codesByName.put(AnnualGeneral.getCodeName().get(), AnnualGeneral);
		codesByName.put(Extraordinary.getCodeName().get(), Extraordinary);
		codesByName.put(Ordinary.getCodeName().get(), Ordinary);
		codesByName.put(Special.getCodeName().get(), Special);
		codesByName.put(ShareExchange.getCodeName().get(), ShareExchange);
		codesByName.put(Standard.getCodeName().get(), Standard);
		codesByName.put(Transfer.getCodeName().get(), Transfer);
		codesByName.put(SurvivorOptions.getCodeName().get(), SurvivorOptions);
		codesByName.put(MortgageBacked.getCodeName().get(), MortgageBacked);
		codesByName.put(SaleOfAssets.getCodeName().get(), SaleOfAssets);
		codesByName.put(PhysicalRightsNotIssued.getCodeName().get(), PhysicalRightsNotIssued);
		codesByName.put(PoisonPill.getCodeName().get(), PoisonPill);
		codesByName.put(DividendReinvestmentByIssuer.getCodeName().get(), DividendReinvestmentByIssuer);
		codesByName.put(MandatoryRedemptionOfShares.getCodeName().get(), MandatoryRedemptionOfShares);
		codesByName.put(SharePurchasePlan.getCodeName().get(), SharePurchasePlan);
		codesByName.put(OpenOffer.getCodeName().get(), OpenOffer);
		codesByName.put(TenderWithRights.getCodeName().get(), TenderWithRights);
		codesByName.put(CashinLieu.getCodeName().get(), CashinLieu);
		codesByName.put(BidTenderSealedTender.getCodeName().get(), BidTenderSealedTender);
		codesByName.put(OfferToPurchase.getCodeName().get(), OfferToPurchase);
		codesByName.put(ADR.getCodeName().get(), ADR);
	}

	public static DTCCSubEventType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCSubEventType1Code[] values() {
		DTCCSubEventType1Code[] values = new DTCCSubEventType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCSubEventType1Code> {
		@Override
		public DTCCSubEventType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCSubEventType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}