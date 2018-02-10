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
import com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Result of the Cardholder verification address checks on the street number and
 * the Postal Code from the Cardholder's Address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressMatch
 * CardholderAddressVerificationResult1Code.AddressMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressNotMatch
 * CardholderAddressVerificationResult1Code.AddressNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressTechnical
 * CardholderAddressVerificationResult1Code.AddressTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressNotTechnical
 * CardholderAddressVerificationResult1Code.AddressNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressMissing
 * CardholderAddressVerificationResult1Code.AddressMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#AddressNotUsed
 * CardholderAddressVerificationResult1Code.AddressNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalMatch
 * CardholderAddressVerificationResult1Code.PostalMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalNotMatch
 * CardholderAddressVerificationResult1Code.PostalNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalTechnical
 * CardholderAddressVerificationResult1Code.PostalTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalNotTechnical
 * CardholderAddressVerificationResult1Code.PostalNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalMissing
 * CardholderAddressVerificationResult1Code.PostalMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#PostalNotUsed
 * CardholderAddressVerificationResult1Code.PostalNotUsed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
 * CardholderAddressVerificationResultCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"AMCH"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CardholderAddressVerificationResult1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Result of the Cardholder verification address checks on the street number and the Postal Code from the Cardholder's Address."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CardholderAddressVerificationResult1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressMatch"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressMatch = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotMatch"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressNotMatch = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressNotMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressTechnical"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressTechnical = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotTechnical"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressNotTechnical = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressNotTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressMissing"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressMissing = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AddressNotUsed"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code AddressNotUsed = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.AddressNotUsed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalMatch"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalMatch = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotMatch"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalNotMatch = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotMatch";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalNotMatch.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalTechnical"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalTechnical = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotTechnical"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalNotTechnical = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotTechnical";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalNotTechnical.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalMissing"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalMissing = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalMissing";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalMissing.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code
	 * CardholderAddressVerificationResult1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PostalNotUsed"</li>
	 * </ul>
	 */
	public static final CardholderAddressVerificationResult1Code PostalNotUsed = new CardholderAddressVerificationResult1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotUsed";
			owner_lazy = () -> com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmObject();
			codeName = CardholderAddressVerificationResultCode.PostalNotUsed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, CardholderAddressVerificationResult1Code> codesByName = new LinkedHashMap<>();

	protected CardholderAddressVerificationResult1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("AMCH");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CardholderAddressVerificationResult1Code";
				definition = "Result of the Cardholder verification address checks on the street number and the Postal Code from the Cardholder's Address.";
				trace_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.AddressNotUsed,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.PostalNotUsed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AddressMatch.getCodeName().get(), AddressMatch);
		codesByName.put(AddressNotMatch.getCodeName().get(), AddressNotMatch);
		codesByName.put(AddressTechnical.getCodeName().get(), AddressTechnical);
		codesByName.put(AddressNotTechnical.getCodeName().get(), AddressNotTechnical);
		codesByName.put(AddressMissing.getCodeName().get(), AddressMissing);
		codesByName.put(AddressNotUsed.getCodeName().get(), AddressNotUsed);
		codesByName.put(PostalMatch.getCodeName().get(), PostalMatch);
		codesByName.put(PostalNotMatch.getCodeName().get(), PostalNotMatch);
		codesByName.put(PostalTechnical.getCodeName().get(), PostalTechnical);
		codesByName.put(PostalNotTechnical.getCodeName().get(), PostalNotTechnical);
		codesByName.put(PostalMissing.getCodeName().get(), PostalMissing);
		codesByName.put(PostalNotUsed.getCodeName().get(), PostalNotUsed);
	}

	public static CardholderAddressVerificationResult1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CardholderAddressVerificationResult1Code[] values() {
		CardholderAddressVerificationResult1Code[] values = new CardholderAddressVerificationResult1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CardholderAddressVerificationResult1Code> {
		@Override
		public CardholderAddressVerificationResult1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CardholderAddressVerificationResult1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}