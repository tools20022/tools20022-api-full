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
import com.tools20022.repository.codeset.CardholderAddressVerificationResultCode;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Result of the Cardholder verification address checks on the street number and
 * the Postal Code from the Cardholder's Address.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResultCode
 * CardholderAddressVerificationResultCode}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressMatch
 * CardholderAddressVerificationResult1Code.mmAddressMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressNotMatch
 * CardholderAddressVerificationResult1Code.mmAddressNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressTechnical
 * CardholderAddressVerificationResult1Code.mmAddressTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressNotTechnical
 * CardholderAddressVerificationResult1Code.mmAddressNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressMissing
 * CardholderAddressVerificationResult1Code.mmAddressMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmAddressNotUsed
 * CardholderAddressVerificationResult1Code.mmAddressNotUsed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalMatch
 * CardholderAddressVerificationResult1Code.mmPostalMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalNotMatch
 * CardholderAddressVerificationResult1Code.mmPostalNotMatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalTechnical
 * CardholderAddressVerificationResult1Code.mmPostalTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalNotTechnical
 * CardholderAddressVerificationResult1Code.mmPostalNotTechnical}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalMissing
 * CardholderAddressVerificationResult1Code.mmPostalMissing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code#mmPostalNotUsed
 * CardholderAddressVerificationResult1Code.mmPostalNotUsed}</li>
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
public class CardholderAddressVerificationResult1Code extends CardholderAddressVerificationResultCode {

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
	public static final MMCode mmAddressMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressMatch";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmAddressNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotMatch";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmAddressTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressTechnical";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmAddressNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotTechnical";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmAddressMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressMissing";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmAddressNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AddressNotUsed";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalMatch";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalNotMatch = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotMatch";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalTechnical";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalNotTechnical = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotTechnical";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalMissing = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalMissing";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
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
	public static final MMCode mmPostalNotUsed = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PostalNotUsed";
			owner_lazy = () -> CardholderAddressVerificationResult1Code.mmObject();
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				example = Arrays.asList("AMCH");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CardholderAddressVerificationResult1Code";
				definition = "Result of the Cardholder verification address checks on the street number and the Postal Code from the Cardholder's Address.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmAddressNotUsed,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalMatch, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalNotMatch,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalTechnical, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalNotTechnical,
						com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalMissing, com.tools20022.repository.codeset.CardholderAddressVerificationResult1Code.mmPostalNotUsed);
				trace_lazy = () -> CardholderAddressVerificationResultCode.mmObject();
			}
		});
		return mmObject_lazy.get();
	}
}