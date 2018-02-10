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
import com.tools20022.repository.codeset.ISAType2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of the current year ISA.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ISAType2Code#MiniEquity
 * ISAType2Code.MiniEquity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISAType2Code#Maxi
 * ISAType2Code.Maxi}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISAType2Code#MiniCash
 * ISAType2Code.MiniCash}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ISAType2Code#Any
 * ISAType2Code.Any}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ISATypeCode ISATypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"MINE"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ISAType2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the type of the current year ISA."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ISAType2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISAType2Code ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniEquity"</li>
	 * </ul>
	 */
	public static final ISAType2Code MiniEquity = new ISAType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniEquity";
			owner_lazy = () -> com.tools20022.repository.codeset.ISAType2Code.mmObject();
			codeName = ISATypeCode.MiniEquity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISAType2Code ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Maxi"</li>
	 * </ul>
	 */
	public static final ISAType2Code Maxi = new ISAType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Maxi";
			owner_lazy = () -> com.tools20022.repository.codeset.ISAType2Code.mmObject();
			codeName = ISATypeCode.Maxi.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISAType2Code ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MiniCash"</li>
	 * </ul>
	 */
	public static final ISAType2Code MiniCash = new ISAType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MiniCash";
			owner_lazy = () -> com.tools20022.repository.codeset.ISAType2Code.mmObject();
			codeName = ISATypeCode.MiniCash.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ISAType2Code ISAType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Any"</li>
	 * </ul>
	 */
	public static final ISAType2Code Any = new ISAType2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Any";
			owner_lazy = () -> com.tools20022.repository.codeset.ISAType2Code.mmObject();
			codeName = ISATypeCode.Any.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ISAType2Code> codesByName = new LinkedHashMap<>();

	protected ISAType2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MINE");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ISAType2Code";
				definition = "Specifies the type of the current year ISA.";
				trace_lazy = () -> ISATypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ISAType2Code.MiniEquity, com.tools20022.repository.codeset.ISAType2Code.Maxi, com.tools20022.repository.codeset.ISAType2Code.MiniCash,
						com.tools20022.repository.codeset.ISAType2Code.Any);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(MiniEquity.getCodeName().get(), MiniEquity);
		codesByName.put(Maxi.getCodeName().get(), Maxi);
		codesByName.put(MiniCash.getCodeName().get(), MiniCash);
		codesByName.put(Any.getCodeName().get(), Any);
	}

	public static ISAType2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ISAType2Code[] values() {
		ISAType2Code[] values = new ISAType2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ISAType2Code> {
		@Override
		public ISAType2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ISAType2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}