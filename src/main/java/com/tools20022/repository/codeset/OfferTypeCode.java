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
import com.tools20022.repository.codeset.OfferTypeCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode#DissenterRights
 * OfferTypeCode.DissenterRights}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode#RestrictionExchange
 * OfferTypeCode.RestrictionExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode#FirstComeFirstServed
 * OfferTypeCode.FirstComeFirstServed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferTypeCode#FinalOffer
 * OfferTypeCode.FinalOffer}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferTypeCode#MiniTender
 * OfferTypeCode.MiniTender}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferTypeCode#PartialOffer
 * OfferTypeCode.PartialOffer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode#SqueezeOutBid
 * OfferTypeCode.SqueezeOutBid}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferType1Code
 * OfferType1Code}</li>
 * </ul>
 * </li>
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
 * "OfferTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the conditions that apply to the offer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OfferTypeV2Code
 * OfferTypeV2Code}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OfferTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Securities holder has the right to disagree with a mandatory event. This
	 * right is not inherent in all offers and therefore must be noted in
	 * announcements only when applicable.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DissenterRights"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode DissenterRights = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "DissenterRights";
			definition = "Securities holder has the right to disagree with a mandatory event. This right is not inherent in all offers and therefore must be noted in announcements only when applicable.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "DISS";
		}
	};
	/**
	 * Exchange of Restricted to Unrestricted (or vice versa).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ERUN"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RestrictionExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Exchange of Restricted to Unrestricted (or vice versa)."</li>
	 * </ul>
	 */
	public static final OfferTypeCode RestrictionExchange = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "RestrictionExchange";
			definition = "Exchange of Restricted to Unrestricted (or vice versa).";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "ERUN";
		}
	};
	/**
	 * Securities will be accepted in the order they have been submitted until
	 * the target number of quantity sought is reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FCFS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstComeFirstServed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode FirstComeFirstServed = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FirstComeFirstServed";
			definition = "Securities will be accepted in the order they have been submitted until the target number of quantity sought is reached.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "FCFS";
		}
	};
	/**
	 * Final or last offer to holders subject to offer conditions being reached,
	 * for example, 50 percent accepted on a tender.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FINL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinalOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode FinalOffer = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "FinalOffer";
			definition = "Final or last offer to holders subject to offer conditions being reached, for example, 50 percent accepted on a tender.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "FINL";
		}
	};
	/**
	 * Tender offer for a security that is priced below the current trading
	 * price of that instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MINI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniTender"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Tender offer for a security that is priced below the current trading price of that instrument."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode MiniTender = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "MiniTender";
			definition = "Tender offer for a security that is priced below the current trading price of that instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "MINI";
		}
	};
	/**
	 * Offer made by the offeror for a portion of the outstanding shares not
	 * already owned by the offeror.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PART"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialOffer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode PartialOffer = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "PartialOffer";
			definition = "Offer made by the offeror for a portion of the outstanding shares not already owned by the offeror.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "PART";
		}
	};
	/**
	 * Offer launched by a company, in possession of a large number of the
	 * shares (90% - 95%) of a company (generally as a result of a tender
	 * offer), in order to acquire the remaining shares of that company.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OfferTypeCode
	 * OfferTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SQUE"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SqueezeOutBid"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company."
	 * </li>
	 * </ul>
	 */
	public static final OfferTypeCode SqueezeOutBid = new OfferTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "SqueezeOutBid";
			definition = "Offer launched by a company, in possession of a large number of the shares (90% - 95%) of a company (generally as a result of a tender offer), in order to acquire the remaining shares of that company.";
			owner_lazy = () -> com.tools20022.repository.codeset.OfferTypeCode.mmObject();
			codeName = "SQUE";
		}
	};
	final static private LinkedHashMap<String, OfferTypeCode> codesByName = new LinkedHashMap<>();

	protected OfferTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("DISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OfferTypeCode";
				definition = "Specifies the conditions that apply to the offer.";
				nextVersions_lazy = () -> Arrays.asList(OfferTypeV2Code.mmObject());
				derivation_lazy = () -> Arrays.asList(OfferType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OfferTypeCode.DissenterRights, com.tools20022.repository.codeset.OfferTypeCode.RestrictionExchange,
						com.tools20022.repository.codeset.OfferTypeCode.FirstComeFirstServed, com.tools20022.repository.codeset.OfferTypeCode.FinalOffer, com.tools20022.repository.codeset.OfferTypeCode.MiniTender,
						com.tools20022.repository.codeset.OfferTypeCode.PartialOffer, com.tools20022.repository.codeset.OfferTypeCode.SqueezeOutBid);
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

	public static OfferTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OfferTypeCode[] values() {
		OfferTypeCode[] values = new OfferTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OfferTypeCode> {
		@Override
		public OfferTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OfferTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}