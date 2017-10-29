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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Byte padding for a cypher block chaining mode encryption, if the padding is
 * not implicit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode#LengthPadding
 * BytePaddingCode.LengthPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode#Null80Padding
 * BytePaddingCode.Null80Padding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode#NullLengthPadding
 * BytePaddingCode.NullLengthPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode#NullPadding
 * BytePaddingCode.NullPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode#RandomPadding
 * BytePaddingCode.RandomPadding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BytePadding1Code
 * BytePadding1Code}</li>
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
 * <li>"RAND"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BytePaddingCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit."
 * </li>
 * </ul>
 */
public class BytePaddingCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Message to encrypt is completed by a byte value containing the total
	 * number of added bytes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
	 * BytePaddingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "LNGT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to encrypt is completed by a byte value containing the total number of added bytes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode LengthPadding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthPadding";
			definition = "Message to encrypt is completed by a byte value containing the total number of added bytes.";
			owner_lazy = () -> BytePaddingCode.mmObject();
			codeName = "LNGT";
		}
	};
	/**
	 * Message to encrypt is completed by one bit of value 1, followed by null
	 * bits until the encryption block length is reached.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
	 * BytePaddingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NUL8"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Null80Padding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached."
	 * </li>
	 * </ul>
	 */
	public static final MMCode Null80Padding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Null80Padding";
			definition = "Message to encrypt is completed by one bit of value 1, followed by null bits until the encryption block length is reached.";
			owner_lazy = () -> BytePaddingCode.mmObject();
			codeName = "NUL8";
		}
	};
	/**
	 * Message to encrypt is completed by null byte values, the last byte
	 * containing the total number of added bytes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
	 * BytePaddingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NULG"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NullLengthPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode NullLengthPadding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NullLengthPadding";
			definition = "Message to encrypt is completed by null byte values, the last byte containing the total number of added bytes.";
			owner_lazy = () -> BytePaddingCode.mmObject();
			codeName = "NULG";
		}
	};
	/**
	 * Message to encrypt is completed by null bytes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
	 * BytePaddingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NULL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NullPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Message to encrypt is completed by null bytes."</li>
	 * </ul>
	 */
	public static final MMCode NullPadding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NullPadding";
			definition = "Message to encrypt is completed by null bytes.";
			owner_lazy = () -> BytePaddingCode.mmObject();
			codeName = "NULL";
		}
	};
	/**
	 * Message to encrypt is completed by random value, the last byte containing
	 * the total number of added bytes.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
	 * BytePaddingCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RAND"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Message to encrypt is completed by random value, the last byte containing the total number of added bytes."
	 * </li>
	 * </ul>
	 */
	public static final MMCode RandomPadding = new MMCode() {
		{
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RandomPadding";
			definition = "Message to encrypt is completed by random value, the last byte containing the total number of added bytes.";
			owner_lazy = () -> BytePaddingCode.mmObject();
			codeName = "RAND";
		}
	};

	static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.dataDict;
				example = Arrays.asList("RAND");
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "BytePaddingCode";
				definition = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.";
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BytePaddingCode.LengthPadding, com.tools20022.repository.codeset.BytePaddingCode.Null80Padding,
						com.tools20022.repository.codeset.BytePaddingCode.NullLengthPadding, com.tools20022.repository.codeset.BytePaddingCode.NullPadding, com.tools20022.repository.codeset.BytePaddingCode.RandomPadding);
				derivation_lazy = () -> Arrays.asList(BytePadding1Code.mmObject());
			}
		});
		return mmObject_lazy.get();
	}
}