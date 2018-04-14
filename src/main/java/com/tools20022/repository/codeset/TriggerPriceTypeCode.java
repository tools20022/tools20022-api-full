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
import com.tools20022.repository.codeset.TriggerPriceTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of price that the trigger is compared to.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#BestOffer
 * TriggerPriceTypeCode.BestOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#LastTrade
 * TriggerPriceTypeCode.LastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#BestBid
 * TriggerPriceTypeCode.BestBid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#BestBidOrLastTrade
 * TriggerPriceTypeCode.BestBidOrLastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#BestOfferOrLastTrade
 * TriggerPriceTypeCode.BestOfferOrLastTrade}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TriggerPriceTypeCode#BestMid
 * TriggerPriceTypeCode.BestMid}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TriggerPriceTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of price that the trigger is compared to."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TriggerPriceTypeCode extends MMCode {

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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best offer."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode BestOffer = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestOffer";
			definition = "Trigger is compared to best offer.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to last trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode LastTrade = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LastTrade";
			definition = "Trigger is compared to last trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestBid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best bid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode BestBid = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestBid";
			definition = "Trigger is compared to best bid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestBidOrLastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best bid or last trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode BestBidOrLastTrade = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestBidOrLastTrade";
			definition = "Trigger is compared to best bid or last trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestOfferOrLastTrade"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best offer or last trade."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode BestOfferOrLastTrade = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestOfferOrLastTrade";
			definition = "Trigger is compared to best offer or last trade.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BestMid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trigger is compared to best mid."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final TriggerPriceTypeCode BestMid = new TriggerPriceTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BestMid";
			definition = "Trigger is compared to best mid.";
			owner_lazy = () -> com.tools20022.repository.codeset.TriggerPriceTypeCode.mmObject();
			codeName = "BEMI";
		}
	};
	final static private LinkedHashMap<String, TriggerPriceTypeCode> codesByName = new LinkedHashMap<>();

	protected TriggerPriceTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("BEOF");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TriggerPriceTypeCode";
				definition = "Specifies the type of price that the trigger is compared to.";
				derivation_lazy = () -> Arrays.asList(TriggerPriceType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TriggerPriceTypeCode.BestOffer, com.tools20022.repository.codeset.TriggerPriceTypeCode.LastTrade,
						com.tools20022.repository.codeset.TriggerPriceTypeCode.BestBid, com.tools20022.repository.codeset.TriggerPriceTypeCode.BestBidOrLastTrade, com.tools20022.repository.codeset.TriggerPriceTypeCode.BestOfferOrLastTrade,
						com.tools20022.repository.codeset.TriggerPriceTypeCode.BestMid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BestOffer.getCodeName().get(), BestOffer);
		codesByName.put(LastTrade.getCodeName().get(), LastTrade);
		codesByName.put(BestBid.getCodeName().get(), BestBid);
		codesByName.put(BestBidOrLastTrade.getCodeName().get(), BestBidOrLastTrade);
		codesByName.put(BestOfferOrLastTrade.getCodeName().get(), BestOfferOrLastTrade);
		codesByName.put(BestMid.getCodeName().get(), BestMid);
	}

	public static TriggerPriceTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TriggerPriceTypeCode[] values() {
		TriggerPriceTypeCode[] values = new TriggerPriceTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TriggerPriceTypeCode> {
		@Override
		public TriggerPriceTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TriggerPriceTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}