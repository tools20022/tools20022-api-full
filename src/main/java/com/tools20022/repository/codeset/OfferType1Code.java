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
import com.tools20022.repository.codeset.OfferType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OfferType1Code#DissenterRights
 * OfferType1Code.DissenterRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType1Code#RestrictionExchange
 * OfferType1Code.RestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType1Code#FirstComeFirstServed
 * OfferType1Code.FirstComeFirstServed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferType1Code#FinalOffer
 * OfferType1Code.FinalOffer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferType1Code#MiniTender
 * OfferType1Code.MiniTender}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType1Code#PartialOffer
 * OfferType1Code.PartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferType1Code#SqueezeOutBid
 * OfferType1Code.SqueezeOutBid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode OfferTypeCode}</li>
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
 * "OfferType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions that apply to the offer."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DissenterRights"</li>
	 * </ul>
	 */
	public static final OfferType1Code DissenterRights = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DissenterRights";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.DissenterRights.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionExchange"</li>
	 * </ul>
	 */
	public static final OfferType1Code RestrictionExchange = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RestrictionExchange";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.RestrictionExchange.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstComeFirstServed"</li>
	 * </ul>
	 */
	public static final OfferType1Code FirstComeFirstServed = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstComeFirstServed";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.FirstComeFirstServed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalOffer"</li>
	 * </ul>
	 */
	public static final OfferType1Code FinalOffer = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinalOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.FinalOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniTender"</li>
	 * </ul>
	 */
	public static final OfferType1Code MiniTender = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniTender";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.MiniTender.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOffer"</li>
	 * </ul>
	 */
	public static final OfferType1Code PartialOffer = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialOffer";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.PartialOffer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferType1Code
	 * OfferType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SqueezeOutBid"</li>
	 * </ul>
	 */
	public static final OfferType1Code SqueezeOutBid = new OfferType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SqueezeOutBid";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferType1Code.mmObject();
			codeName = OfferTypeCode.SqueezeOutBid.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OfferType1Code> codesByName = new LinkedHashMap<>();

	protected OfferType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferType1Code";
				definition = "Specifies the conditions that apply to the offer.";
				trace_lazy = () -> OfferTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferType1Code.DissenterRights, com.tools20022.repository.codeset.OfferType1Code.RestrictionExchange,
						com.tools20022.repository.codeset.OfferType1Code.FirstComeFirstServed, com.tools20022.repository.codeset.OfferType1Code.FinalOffer, com.tools20022.repository.codeset.OfferType1Code.MiniTender,
						com.tools20022.repository.codeset.OfferType1Code.PartialOffer, com.tools20022.repository.codeset.OfferType1Code.SqueezeOutBid);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(DissenterRights.getCodeName().get(), DissenterRights);
		codesByName.put(RestrictionExchange.getCodeName().get(), RestrictionExchange);
		codesByName.put(FirstComeFirstServed.getCodeName().get(), FirstComeFirstServed);
		codesByName.put(FinalOffer.getCodeName().get(), FinalOffer);
		codesByName.put(MiniTender.getCodeName().get(), MiniTender);
		codesByName.put(PartialOffer.getCodeName().get(), PartialOffer);
		codesByName.put(SqueezeOutBid.getCodeName().get(), SqueezeOutBid);
	}

	public static OfferType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferType1Code[] values() {
		OfferType1Code[] values = new OfferType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferType1Code> {
		@Override
		public OfferType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}