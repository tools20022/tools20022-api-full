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
import com.tools20022.repository.codeset.OfferType3Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OfferType3Code#SqueezeOutBid
 * OfferType3Code.SqueezeOutBid}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType3Code#RestrictionExchange
 * OfferType3Code.RestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType3Code#PartialOffer
 * OfferType3Code.PartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType3Code#FirstComeFirstServed
 * OfferType3Code.FirstComeFirstServed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferType3Code#FinalOffer
 * OfferType3Code.FinalOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType3Code#DissenterRights
 * OfferType3Code.DissenterRights}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OfferType3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions that apply to the offer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferType3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SqueezeOutBid"</li>
	 * </ul>
	 */
	public static final OfferType3Code SqueezeOutBid = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.SqueezeOutBid.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionExchange"</li>
	 * </ul>
	 */
	public static final OfferType3Code RestrictionExchange = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.RestrictionExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOffer"</li>
	 * </ul>
	 */
	public static final OfferType3Code PartialOffer = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.PartialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstComeFirstServed"</li>
	 * </ul>
	 */
	public static final OfferType3Code FirstComeFirstServed = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.FirstComeFirstServed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalOffer"</li>
	 * </ul>
	 */
	public static final OfferType3Code FinalOffer = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.FinalOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType3Code
	 * OfferType3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DissenterRights"</li>
	 * </ul>
	 */
	public static final OfferType3Code DissenterRights = new OfferType3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType3Code.mmObject();
			codeName = OfferTypeV2Code.DissenterRights.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OfferType3Code> codesByName = new LinkedHashMap<>();

	protected OfferType3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferType3Code";
				definition = "Specifies the conditions that apply to the offer.";
				trace_lazy = () -> OfferTypeV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferType3Code.SqueezeOutBid, com.tools20022.repository.codeset.OfferType3Code.RestrictionExchange,
						com.tools20022.repository.codeset.OfferType3Code.PartialOffer, com.tools20022.repository.codeset.OfferType3Code.FirstComeFirstServed, com.tools20022.repository.codeset.OfferType3Code.FinalOffer,
						com.tools20022.repository.codeset.OfferType3Code.DissenterRights);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SqueezeOutBid.getCodeName().get(), SqueezeOutBid);
		codesByName.put(RestrictionExchange.getCodeName().get(), RestrictionExchange);
		codesByName.put(PartialOffer.getCodeName().get(), PartialOffer);
		codesByName.put(FirstComeFirstServed.getCodeName().get(), FirstComeFirstServed);
		codesByName.put(FinalOffer.getCodeName().get(), FinalOffer);
		codesByName.put(DissenterRights.getCodeName().get(), DissenterRights);
	}

	public static OfferType3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferType3Code[] values() {
		OfferType3Code[] values = new OfferType3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferType3Code> {
		@Override
		public OfferType3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferType3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}