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
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Specifies the type of price that the trigger is compared to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmBestOffer
 * TriggerPriceTypeCode.mmBestOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmLastTrade
 * TriggerPriceTypeCode.mmLastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmBestBid
 * TriggerPriceTypeCode.mmBestBid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmBestBidOrLastTrade
 * TriggerPriceTypeCode.mmBestBidOrLastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmBestOfferOrLastTrade
 * TriggerPriceTypeCode.mmBestOfferOrLastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#mmBestMid
 * TriggerPriceTypeCode.mmBestMid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.TriggerPriceType1Code
 * TriggerPriceType1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"BEOF"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerPriceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price that the trigger is compared to."</li>
 * </ul>
 */
public class TriggerPriceTypeCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Trigger is compared to best offer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEOF"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best offer."</li>
	 * </ul>
	 */
	public static final MMCode mmBestOffer = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestOffer";
			definition = "Trigger is compared to best offer.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "BEOF";
		}
	};
	/**
	 * Trigger is compared to last trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LATR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to last trade."</li>
	 * </ul>
	 */
	public static final MMCode mmLastTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTrade";
			definition = "Trigger is compared to last trade.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "LATR";
		}
	};
	/**
	 * Trigger is compared to best bid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEBI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestBid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best bid."</li>
	 * </ul>
	 */
	public static final MMCode mmBestBid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestBid";
			definition = "Trigger is compared to best bid.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "BEBI";
		}
	};
	/**
	 * Trigger is compared to best bid or last trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BBLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestBidOrLastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best bid or last trade."</li>
	 * </ul>
	 */
	public static final MMCode mmBestBidOrLastTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestBidOrLastTrade";
			definition = "Trigger is compared to best bid or last trade.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "BBLT";
		}
	};
	/**
	 * Trigger is compared to best offer or last trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BOLT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestOfferOrLastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best offer or last trade."</li>
	 * </ul>
	 */
	public static final MMCode mmBestOfferOrLastTrade = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestOfferOrLastTrade";
			definition = "Trigger is compared to best offer or last trade.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "BOLT";
		}
	};
	/**
	 * Trigger is compared to best mid.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode
	 * TriggerPriceTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BEMI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestMid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best mid."</li>
	 * </ul>
	 */
	public static final MMCode mmBestMid = new MMCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestMid";
			definition = "Trigger is compared to best mid.";
			owner_lazy = () -> TriggerPriceTypeCode.mmObject();
			codeName = "BEMI";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("BEOF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerPriceTypeCode";
				definition = "Specifies the type of price that the trigger is compared to.";
				code_lazy = () -> Arrays.asList(TriggerPriceTypeCode.mmBestOffer, TriggerPriceTypeCode.mmLastTrade, TriggerPriceTypeCode.mmBestBid, TriggerPriceTypeCode.mmBestBidOrLastTrade, TriggerPriceTypeCode.mmBestOfferOrLastTrade,
						TriggerPriceTypeCode.mmBestMid);
				derivation_lazy = () -> Arrays.asList(TriggerPriceType1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}