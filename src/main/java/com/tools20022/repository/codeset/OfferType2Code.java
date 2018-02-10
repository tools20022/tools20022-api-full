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
import com.tools20022.repository.codeset.OfferType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the conditions that apply to the offer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#DissenterRights
 * OfferType2Code.DissenterRights}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferType2Code#FinalOffer
 * OfferType2Code.FinalOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#FirstComeFirstServed
 * OfferType2Code.FirstComeFirstServed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#MiniOddLotOffer
 * OfferType2Code.MiniOddLotOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#PartialOffer
 * OfferType2Code.PartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#RestrictionExchange
 * OfferType2Code.RestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType2Code#SqueezeOutBid
 * OfferType2Code.SqueezeOutBid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
 * OfferTypeV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"DISS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OfferType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions that apply to the offer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DissenterRights"</li>
	 * </ul>
	 */
	public static final OfferType2Code DissenterRights = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.DissenterRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalOffer"</li>
	 * </ul>
	 */
	public static final OfferType2Code FinalOffer = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.FinalOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstComeFirstServed"</li>
	 * </ul>
	 */
	public static final OfferType2Code FirstComeFirstServed = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.FirstComeFirstServed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniOddLotOffer"</li>
	 * </ul>
	 */
	public static final OfferType2Code MiniOddLotOffer = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniOddLotOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.MiniOddLotOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOffer"</li>
	 * </ul>
	 */
	public static final OfferType2Code PartialOffer = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.PartialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionExchange"</li>
	 * </ul>
	 */
	public static final OfferType2Code RestrictionExchange = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.RestrictionExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType2Code
	 * OfferType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SqueezeOutBid"</li>
	 * </ul>
	 */
	public static final OfferType2Code SqueezeOutBid = new OfferType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType2Code.mmObject();
			codeName = OfferTypeV2Code.SqueezeOutBid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OfferType2Code> codesByName = new LinkedHashMap<>();

	protected OfferType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferType2Code";
				definition = "Specifies the conditions that apply to the offer.";
				trace_lazy = () -> OfferTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferType2Code.DissenterRights, com.tools20022.repository.codeset.OfferType2Code.FinalOffer,
						com.tools20022.repository.codeset.OfferType2Code.FirstComeFirstServed, com.tools20022.repository.codeset.OfferType2Code.MiniOddLotOffer, com.tools20022.repository.codeset.OfferType2Code.PartialOffer,
						com.tools20022.repository.codeset.OfferType2Code.RestrictionExchange, com.tools20022.repository.codeset.OfferType2Code.SqueezeOutBid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DissenterRights.getCodeName().get(), DissenterRights);
		codesByName.put(FinalOffer.getCodeName().get(), FinalOffer);
		codesByName.put(FirstComeFirstServed.getCodeName().get(), FirstComeFirstServed);
		codesByName.put(MiniOddLotOffer.getCodeName().get(), MiniOddLotOffer);
		codesByName.put(PartialOffer.getCodeName().get(), PartialOffer);
		codesByName.put(RestrictionExchange.getCodeName().get(), RestrictionExchange);
		codesByName.put(SqueezeOutBid.getCodeName().get(), SqueezeOutBid);
	}

	public static OfferType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferType2Code[] values() {
		OfferType2Code[] values = new OfferType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferType2Code> {
		@Override
		public OfferType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}