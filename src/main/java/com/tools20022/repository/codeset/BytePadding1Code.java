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
import com.tools20022.repository.codeset.BytePadding1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Byte padding for a cypher block chaining mode encryption, if the padding is
 * not implicit.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code#LengthPadding
 * BytePadding1Code.LengthPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code#Null80Padding
 * BytePadding1Code.Null80Padding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code#NullLengthPadding
 * BytePadding1Code.NullLengthPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code#NullPadding
 * BytePadding1Code.NullPadding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code#RandomPadding
 * BytePadding1Code.RandomPadding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BytePaddingCode
 * BytePaddingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BytePadding1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BytePadding1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LengthPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BytePadding1Code LengthPadding = new BytePadding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LengthPadding";
			owner_lazy = () -> com.tools20022.repository.codeset.BytePadding1Code.mmObject();
			codeName = BytePaddingCode.LengthPadding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Null80Padding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BytePadding1Code Null80Padding = new BytePadding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Null80Padding";
			owner_lazy = () -> com.tools20022.repository.codeset.BytePadding1Code.mmObject();
			codeName = BytePaddingCode.Null80Padding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NullLengthPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BytePadding1Code NullLengthPadding = new BytePadding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NullLengthPadding";
			owner_lazy = () -> com.tools20022.repository.codeset.BytePadding1Code.mmObject();
			codeName = BytePaddingCode.NullLengthPadding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NullPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BytePadding1Code NullPadding = new BytePadding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NullPadding";
			owner_lazy = () -> com.tools20022.repository.codeset.BytePadding1Code.mmObject();
			codeName = BytePaddingCode.NullPadding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BytePadding1Code
	 * BytePadding1Code}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RandomPadding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final BytePadding1Code RandomPadding = new BytePadding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RandomPadding";
			owner_lazy = () -> com.tools20022.repository.codeset.BytePadding1Code.mmObject();
			codeName = BytePaddingCode.RandomPadding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BytePadding1Code> codesByName = new LinkedHashMap<>();

	protected BytePadding1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BytePadding1Code";
				definition = "Byte padding for a cypher block chaining mode encryption, if the padding is not implicit.";
				trace_lazy = () -> BytePaddingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BytePadding1Code.LengthPadding, com.tools20022.repository.codeset.BytePadding1Code.Null80Padding,
						com.tools20022.repository.codeset.BytePadding1Code.NullLengthPadding, com.tools20022.repository.codeset.BytePadding1Code.NullPadding, com.tools20022.repository.codeset.BytePadding1Code.RandomPadding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(LengthPadding.getCodeName().get(), LengthPadding);
		codesByName.put(Null80Padding.getCodeName().get(), Null80Padding);
		codesByName.put(NullLengthPadding.getCodeName().get(), NullLengthPadding);
		codesByName.put(NullPadding.getCodeName().get(), NullPadding);
		codesByName.put(RandomPadding.getCodeName().get(), RandomPadding);
	}

	public static BytePadding1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BytePadding1Code[] values() {
		BytePadding1Code[] values = new BytePadding1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BytePadding1Code> {
		@Override
		public BytePadding1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BytePadding1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}