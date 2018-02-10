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
import com.tools20022.repository.codeset.ExoticOptionStyle1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the option style.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code#BinaryOption
 * ExoticOptionStyle1Code.BinaryOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code#DigitalOption
 * ExoticOptionStyle1Code.DigitalOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code#NoTouchOption
 * ExoticOptionStyle1Code.NoTouchOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code#VanillaOption
 * ExoticOptionStyle1Code.VanillaOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode
 * ExoticOptionStyleCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExoticOptionStyle1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the option style."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExoticOptionStyle1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
	 * ExoticOptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BinaryOption"</li>
	 * </ul>
	 */
	public static final ExoticOptionStyle1Code BinaryOption = new ExoticOptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BinaryOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyle1Code.mmObject();
			codeName = ExoticOptionStyleCode.BinaryOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
	 * ExoticOptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalOption"</li>
	 * </ul>
	 */
	public static final ExoticOptionStyle1Code DigitalOption = new ExoticOptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyle1Code.mmObject();
			codeName = ExoticOptionStyleCode.DigitalOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
	 * ExoticOptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTouchOption"</li>
	 * </ul>
	 */
	public static final ExoticOptionStyle1Code NoTouchOption = new ExoticOptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTouchOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyle1Code.mmObject();
			codeName = ExoticOptionStyleCode.NoTouchOption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
	 * ExoticOptionStyle1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VanillaOption"</li>
	 * </ul>
	 */
	public static final ExoticOptionStyle1Code VanillaOption = new ExoticOptionStyle1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VanillaOption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyle1Code.mmObject();
			codeName = ExoticOptionStyleCode.VanillaOption.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExoticOptionStyle1Code> codesByName = new LinkedHashMap<>();

	protected ExoticOptionStyle1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExoticOptionStyle1Code";
				definition = "Specifies the option style.";
				trace_lazy = () -> ExoticOptionStyleCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExoticOptionStyle1Code.BinaryOption, com.tools20022.repository.codeset.ExoticOptionStyle1Code.DigitalOption,
						com.tools20022.repository.codeset.ExoticOptionStyle1Code.NoTouchOption, com.tools20022.repository.codeset.ExoticOptionStyle1Code.VanillaOption);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(BinaryOption.getCodeName().get(), BinaryOption);
		codesByName.put(DigitalOption.getCodeName().get(), DigitalOption);
		codesByName.put(NoTouchOption.getCodeName().get(), NoTouchOption);
		codesByName.put(VanillaOption.getCodeName().get(), VanillaOption);
	}

	public static ExoticOptionStyle1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExoticOptionStyle1Code[] values() {
		ExoticOptionStyle1Code[] values = new ExoticOptionStyle1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExoticOptionStyle1Code> {
		@Override
		public ExoticOptionStyle1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExoticOptionStyle1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}