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
import com.tools20022.repository.codeset.DTCCSubEventType5Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#OptOut
 * DTCCSubEventType5Code.OptOut}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#DividendReinvestmentByDTC
 * DTCCSubEventType5Code.DividendReinvestmentByDTC}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#PlaceOfListing
 * DTCCSubEventType5Code.PlaceOfListing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#BoardLot
 * DTCCSubEventType5Code.BoardLot}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Remarketing
 * DTCCSubEventType5Code.Remarketing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Unwind
 * DTCCSubEventType5Code.Unwind}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#ShareExchange
 * DTCCSubEventType5Code.ShareExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Standard
 * DTCCSubEventType5Code.Standard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Transfer
 * DTCCSubEventType5Code.Transfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#SurvivorOptions
 * DTCCSubEventType5Code.SurvivorOptions}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#MortgageBacked
 * DTCCSubEventType5Code.MortgageBacked}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#SaleOfAssets
 * DTCCSubEventType5Code.SaleOfAssets}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#PhysicalRightsNotIssued
 * DTCCSubEventType5Code.PhysicalRightsNotIssued}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#PoisonPill
 * DTCCSubEventType5Code.PoisonPill}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#DividendReinvestmentByIssuer
 * DTCCSubEventType5Code.DividendReinvestmentByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#MandatoryRedemptionOfShares
 * DTCCSubEventType5Code.MandatoryRedemptionOfShares}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#SharePurchasePlan
 * DTCCSubEventType5Code.SharePurchasePlan}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#OpenOffer
 * DTCCSubEventType5Code.OpenOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#TenderWithRights
 * DTCCSubEventType5Code.TenderWithRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#CashinLieu
 * DTCCSubEventType5Code.CashinLieu}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#BidTenderSealedTender
 * DTCCSubEventType5Code.BidTenderSealedTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#OfferToPurchase
 * DTCCSubEventType5Code.OfferToPurchase}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#ADR
 * DTCCSubEventType5Code.ADR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#WithPayout
 * DTCCSubEventType5Code.WithPayout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#WithoutPayout
 * DTCCSubEventType5Code.WithoutPayout}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#TaxCredit
 * DTCCSubEventType5Code.TaxCredit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#USLegal144A
 * DTCCSubEventType5Code.USLegal144A}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#CashAndSecurities
 * DTCCSubEventType5Code.CashAndSecurities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#RegulationS
 * DTCCSubEventType5Code.RegulationS}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#ImportantNotice
 * DTCCSubEventType5Code.ImportantNotice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#BasedOnRecordDateHoldings
 * DTCCSubEventType5Code.BasedOnRecordDateHoldings}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Cash
 * DTCCSubEventType5Code.Cash}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#PresentationRequired
 * DTCCSubEventType5Code.PresentationRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#Securities
 * DTCCSubEventType5Code.Securities}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#ConvertAndTender
 * DTCCSubEventType5Code.ConvertAndTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#MiniTender
 * DTCCSubEventType5Code.MiniTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#SelfTender
 * DTCCSubEventType5Code.SelfTender}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#GDR
 * DTCCSubEventType5Code.GDR}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#DividendEquivalentPayment871M
 * DTCCSubEventType5Code.DividendEquivalentPayment871M}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code#DeemedDividend305C
 * DTCCSubEventType5Code.DeemedDividend305C}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DTCCSubEventType5Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code
 * DTCCSubEventType4Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DTCCSubEventType5Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OptOut"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#OptOut
	 * DTCCSubEventType4Code.OptOut}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code OptOut = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OptOut";
			previousVersion_lazy = () -> DTCCSubEventType4Code.OptOut;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.OptOut.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByDTC"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#DividendReinvestmentByDTC
	 * DTCCSubEventType4Code.DividendReinvestmentByDTC}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code DividendReinvestmentByDTC = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByDTC";
			previousVersion_lazy = () -> DTCCSubEventType4Code.DividendReinvestmentByDTC;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByDTC.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PlaceOfListing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#PlaceOfListing
	 * DTCCSubEventType4Code.PlaceOfListing}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code PlaceOfListing = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PlaceOfListing";
			previousVersion_lazy = () -> DTCCSubEventType4Code.PlaceOfListing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.PlaceOfListing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BoardLot"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#BoardLot
	 * DTCCSubEventType4Code.BoardLot}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code BoardLot = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BoardLot";
			previousVersion_lazy = () -> DTCCSubEventType4Code.BoardLot;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.BoardLot.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Remarketing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Remarketing
	 * DTCCSubEventType4Code.Remarketing}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Remarketing = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Remarketing";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Remarketing;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Remarketing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unwind"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Unwind
	 * DTCCSubEventType4Code.Unwind}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Unwind = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unwind";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Unwind;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Unwind.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ShareExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#ShareExchange
	 * DTCCSubEventType4Code.ShareExchange}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code ShareExchange = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ShareExchange";
			previousVersion_lazy = () -> DTCCSubEventType4Code.ShareExchange;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.ShareExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Standard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Standard
	 * DTCCSubEventType4Code.Standard}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Standard = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Standard";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Standard;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Standard.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Transfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Transfer
	 * DTCCSubEventType4Code.Transfer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Transfer = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Transfer";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Transfer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Transfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SurvivorOptions"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#SurvivorOptions
	 * DTCCSubEventType4Code.SurvivorOptions}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code SurvivorOptions = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SurvivorOptions";
			previousVersion_lazy = () -> DTCCSubEventType4Code.SurvivorOptions;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.SurvivorOptions.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MortgageBacked"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#MortgageBacked
	 * DTCCSubEventType4Code.MortgageBacked}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code MortgageBacked = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MortgageBacked";
			previousVersion_lazy = () -> DTCCSubEventType4Code.MortgageBacked;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.MortgageBacked.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SaleOfAssets"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#SaleOfAssets
	 * DTCCSubEventType4Code.SaleOfAssets}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code SaleOfAssets = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SaleOfAssets";
			previousVersion_lazy = () -> DTCCSubEventType4Code.SaleOfAssets;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.SaleOfAssets.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalRightsNotIssued"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#PhysicalRightsNotIssued
	 * DTCCSubEventType4Code.PhysicalRightsNotIssued}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code PhysicalRightsNotIssued = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalRightsNotIssued";
			previousVersion_lazy = () -> DTCCSubEventType4Code.PhysicalRightsNotIssued;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.PhysicalRightsNotIssued.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoisonPill"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#PoisonPill
	 * DTCCSubEventType4Code.PoisonPill}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code PoisonPill = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoisonPill";
			previousVersion_lazy = () -> DTCCSubEventType4Code.PoisonPill;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.PoisonPill.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendReinvestmentByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#DividendReinvestmentByIssuer
	 * DTCCSubEventType4Code.DividendReinvestmentByIssuer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code DividendReinvestmentByIssuer = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendReinvestmentByIssuer";
			previousVersion_lazy = () -> DTCCSubEventType4Code.DividendReinvestmentByIssuer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendReinvestmentByIssuer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatoryRedemptionOfShares"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#MandatoryRedemptionOfShares
	 * DTCCSubEventType4Code.MandatoryRedemptionOfShares}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code MandatoryRedemptionOfShares = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatoryRedemptionOfShares";
			previousVersion_lazy = () -> DTCCSubEventType4Code.MandatoryRedemptionOfShares;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.MandatoryRedemptionOfShares.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SharePurchasePlan"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#SharePurchasePlan
	 * DTCCSubEventType4Code.SharePurchasePlan}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code SharePurchasePlan = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SharePurchasePlan";
			previousVersion_lazy = () -> DTCCSubEventType4Code.SharePurchasePlan;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.SharePurchasePlan.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#OpenOffer
	 * DTCCSubEventType4Code.OpenOffer}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code OpenOffer = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenOffer";
			previousVersion_lazy = () -> DTCCSubEventType4Code.OpenOffer;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.OpenOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TenderWithRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#TenderWithRights
	 * DTCCSubEventType4Code.TenderWithRights}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code TenderWithRights = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TenderWithRights";
			previousVersion_lazy = () -> DTCCSubEventType4Code.TenderWithRights;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.TenderWithRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashinLieu"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#CashinLieu
	 * DTCCSubEventType4Code.CashinLieu}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code CashinLieu = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashinLieu";
			previousVersion_lazy = () -> DTCCSubEventType4Code.CashinLieu;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.CashinLieu.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BidTenderSealedTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#BidTenderSealedTender
	 * DTCCSubEventType4Code.BidTenderSealedTender}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code BidTenderSealedTender = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BidTenderSealedTender";
			previousVersion_lazy = () -> DTCCSubEventType4Code.BidTenderSealedTender;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.BidTenderSealedTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OfferToPurchase"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#OfferToPurchase
	 * DTCCSubEventType4Code.OfferToPurchase}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code OfferToPurchase = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OfferToPurchase";
			previousVersion_lazy = () -> DTCCSubEventType4Code.OfferToPurchase;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.OfferToPurchase.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ADR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#ADR
	 * DTCCSubEventType4Code.ADR}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code ADR = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ADR";
			previousVersion_lazy = () -> DTCCSubEventType4Code.ADR;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.ADR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithPayout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#WithPayout
	 * DTCCSubEventType4Code.WithPayout}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code WithPayout = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithPayout";
			previousVersion_lazy = () -> DTCCSubEventType4Code.WithPayout;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.WithPayout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithoutPayout"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#WithoutPayout
	 * DTCCSubEventType4Code.WithoutPayout}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code WithoutPayout = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithoutPayout";
			previousVersion_lazy = () -> DTCCSubEventType4Code.WithoutPayout;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.WithoutPayout.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#TaxCredit
	 * DTCCSubEventType4Code.TaxCredit}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code TaxCredit = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			previousVersion_lazy = () -> DTCCSubEventType4Code.TaxCredit;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.TaxCredit.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "USLegal144A"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#USLegal144A
	 * DTCCSubEventType4Code.USLegal144A}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code USLegal144A = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "USLegal144A";
			previousVersion_lazy = () -> DTCCSubEventType4Code.USLegal144A;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.USLegal144A.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAndSecurities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#CashAndSecurities
	 * DTCCSubEventType4Code.CashAndSecurities}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code CashAndSecurities = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAndSecurities";
			previousVersion_lazy = () -> DTCCSubEventType4Code.CashAndSecurities;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.CashAndSecurities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegulationS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#RegulationS
	 * DTCCSubEventType4Code.RegulationS}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code RegulationS = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegulationS";
			previousVersion_lazy = () -> DTCCSubEventType4Code.RegulationS;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.RegulationS.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ImportantNotice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#ImportantNotice
	 * DTCCSubEventType4Code.ImportantNotice}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code ImportantNotice = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ImportantNotice";
			previousVersion_lazy = () -> DTCCSubEventType4Code.ImportantNotice;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.ImportantNotice.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasedOnRecordDateHoldings"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#BasedOnRecordDateHoldings
	 * DTCCSubEventType4Code.BasedOnRecordDateHoldings}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code BasedOnRecordDateHoldings = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasedOnRecordDateHoldings";
			previousVersion_lazy = () -> DTCCSubEventType4Code.BasedOnRecordDateHoldings;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.BasedOnRecordDateHoldings.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Cash"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Cash
	 * DTCCSubEventType4Code.Cash}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Cash = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Cash";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Cash;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Cash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PresentationRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#PresentationRequired
	 * DTCCSubEventType4Code.PresentationRequired}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code PresentationRequired = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PresentationRequired";
			previousVersion_lazy = () -> DTCCSubEventType4Code.PresentationRequired;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.PresentationRequired.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Securities"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#Securities
	 * DTCCSubEventType4Code.Securities}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code Securities = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Securities";
			previousVersion_lazy = () -> DTCCSubEventType4Code.Securities;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.Securities.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConvertAndTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#ConvertAndTender
	 * DTCCSubEventType4Code.ConvertAndTender}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code ConvertAndTender = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConvertAndTender";
			previousVersion_lazy = () -> DTCCSubEventType4Code.ConvertAndTender;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.ConvertAndTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#MiniTender
	 * DTCCSubEventType4Code.MiniTender}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code MiniTender = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniTender";
			previousVersion_lazy = () -> DTCCSubEventType4Code.MiniTender;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.MiniTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SelfTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#SelfTender
	 * DTCCSubEventType4Code.SelfTender}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code SelfTender = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SelfTender";
			previousVersion_lazy = () -> DTCCSubEventType4Code.SelfTender;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.SelfTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GDR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType4Code#GDR
	 * DTCCSubEventType4Code.GDR}</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code GDR = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GDR";
			previousVersion_lazy = () -> DTCCSubEventType4Code.GDR;
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.GDR.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DividendEquivalentPayment871M"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code DividendEquivalentPayment871M = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DividendEquivalentPayment871M";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.DividendEquivalentPayment871M.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DTCCSubEventType5Code
	 * DTCCSubEventType5Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeemedDividend305C"</li>
	 * </ul>
	 */
	public static final DTCCSubEventType5Code DeemedDividend305C = new DTCCSubEventType5Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeemedDividend305C";
			owner_lazy = () -> com.tools20022.repository.codeset.DTCCSubEventType5Code.mmObject();
			codeName = DTCCSubEventTypeCode.DeemedDividend305C.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DTCCSubEventType5Code> codesByName = new LinkedHashMap<>();

	protected DTCCSubEventType5Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPTO");
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DTCCSubEventType5Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined sub event types.";
				previousVersion_lazy = () -> DTCCSubEventType4Code.mmObject();
				trace_lazy = () -> DTCCSubEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DTCCSubEventType5Code.OptOut, com.tools20022.repository.codeset.DTCCSubEventType5Code.DividendReinvestmentByDTC,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.PlaceOfListing, com.tools20022.repository.codeset.DTCCSubEventType5Code.BoardLot, com.tools20022.repository.codeset.DTCCSubEventType5Code.Remarketing,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.Unwind, com.tools20022.repository.codeset.DTCCSubEventType5Code.ShareExchange, com.tools20022.repository.codeset.DTCCSubEventType5Code.Standard,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.Transfer, com.tools20022.repository.codeset.DTCCSubEventType5Code.SurvivorOptions, com.tools20022.repository.codeset.DTCCSubEventType5Code.MortgageBacked,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.SaleOfAssets, com.tools20022.repository.codeset.DTCCSubEventType5Code.PhysicalRightsNotIssued,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.PoisonPill, com.tools20022.repository.codeset.DTCCSubEventType5Code.DividendReinvestmentByIssuer,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.MandatoryRedemptionOfShares, com.tools20022.repository.codeset.DTCCSubEventType5Code.SharePurchasePlan,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.OpenOffer, com.tools20022.repository.codeset.DTCCSubEventType5Code.TenderWithRights, com.tools20022.repository.codeset.DTCCSubEventType5Code.CashinLieu,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.BidTenderSealedTender, com.tools20022.repository.codeset.DTCCSubEventType5Code.OfferToPurchase, com.tools20022.repository.codeset.DTCCSubEventType5Code.ADR,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.WithPayout, com.tools20022.repository.codeset.DTCCSubEventType5Code.WithoutPayout, com.tools20022.repository.codeset.DTCCSubEventType5Code.TaxCredit,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.USLegal144A, com.tools20022.repository.codeset.DTCCSubEventType5Code.CashAndSecurities, com.tools20022.repository.codeset.DTCCSubEventType5Code.RegulationS,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.ImportantNotice, com.tools20022.repository.codeset.DTCCSubEventType5Code.BasedOnRecordDateHoldings,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.Cash, com.tools20022.repository.codeset.DTCCSubEventType5Code.PresentationRequired, com.tools20022.repository.codeset.DTCCSubEventType5Code.Securities,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.ConvertAndTender, com.tools20022.repository.codeset.DTCCSubEventType5Code.MiniTender, com.tools20022.repository.codeset.DTCCSubEventType5Code.SelfTender,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.GDR, com.tools20022.repository.codeset.DTCCSubEventType5Code.DividendEquivalentPayment871M,
						com.tools20022.repository.codeset.DTCCSubEventType5Code.DeemedDividend305C);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OptOut.getCodeName().get(), OptOut);
		codesByName.put(DividendReinvestmentByDTC.getCodeName().get(), DividendReinvestmentByDTC);
		codesByName.put(PlaceOfListing.getCodeName().get(), PlaceOfListing);
		codesByName.put(BoardLot.getCodeName().get(), BoardLot);
		codesByName.put(Remarketing.getCodeName().get(), Remarketing);
		codesByName.put(Unwind.getCodeName().get(), Unwind);
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
		codesByName.put(WithPayout.getCodeName().get(), WithPayout);
		codesByName.put(WithoutPayout.getCodeName().get(), WithoutPayout);
		codesByName.put(TaxCredit.getCodeName().get(), TaxCredit);
		codesByName.put(USLegal144A.getCodeName().get(), USLegal144A);
		codesByName.put(CashAndSecurities.getCodeName().get(), CashAndSecurities);
		codesByName.put(RegulationS.getCodeName().get(), RegulationS);
		codesByName.put(ImportantNotice.getCodeName().get(), ImportantNotice);
		codesByName.put(BasedOnRecordDateHoldings.getCodeName().get(), BasedOnRecordDateHoldings);
		codesByName.put(Cash.getCodeName().get(), Cash);
		codesByName.put(PresentationRequired.getCodeName().get(), PresentationRequired);
		codesByName.put(Securities.getCodeName().get(), Securities);
		codesByName.put(ConvertAndTender.getCodeName().get(), ConvertAndTender);
		codesByName.put(MiniTender.getCodeName().get(), MiniTender);
		codesByName.put(SelfTender.getCodeName().get(), SelfTender);
		codesByName.put(GDR.getCodeName().get(), GDR);
		codesByName.put(DividendEquivalentPayment871M.getCodeName().get(), DividendEquivalentPayment871M);
		codesByName.put(DeemedDividend305C.getCodeName().get(), DeemedDividend305C);
	}

	public static DTCCSubEventType5Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DTCCSubEventType5Code[] values() {
		DTCCSubEventType5Code[] values = new DTCCSubEventType5Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DTCCSubEventType5Code> {
		@Override
		public DTCCSubEventType5Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DTCCSubEventType5Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}