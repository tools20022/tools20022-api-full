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
import com.tools20022.repository.codeset.ExoticOptionStyleCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode#BinaryOption
 * ExoticOptionStyleCode.BinaryOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode#DigitalOption
 * ExoticOptionStyleCode.DigitalOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode#NoTouchOption
 * ExoticOptionStyleCode.NoTouchOption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode#VanillaOption
 * ExoticOptionStyleCode.VanillaOption}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ExoticOptionStyle1Code
 * ExoticOptionStyle1Code}</li>
 * </ul>
 * </li>
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
 * "ExoticOptionStyleCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the option style."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExoticOptionStyleCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Agreement under which a fixed amount is paid out if a specific condition
	 * is met at any time during the exercise period. The expiration style is
	 * European or American. The binary option has only "payment triggers".
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode
	 * ExoticOptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BINA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BinaryOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which a fixed amount is paid out if a specific condition is met at any time during the exercise period. The expiration style is European or American. The binary option has only \"payment triggers\"."
	 * </li>
	 * </ul>
	 */
	public static final ExoticOptionStyleCode BinaryOption = new ExoticOptionStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BinaryOption";
			definition = "Agreement under which a fixed amount is paid out if a specific condition is met at any time during the exercise period. The expiration style is European or American. The binary option has only \"payment triggers\".";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyleCode.mmObject();
			codeName = "BINA";
		}
	};
	/**
	 * Agreement under which a fixed amount is paid out if a specific condition
	 * is met on expiration date. The digital option has only "payment triggers"
	 * which may be single or double trigger level.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode
	 * ExoticOptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DIGI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DigitalOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which a fixed amount is paid out if a specific condition is met on expiration date. The digital option has only \"payment triggers\" which may be single or double trigger level."
	 * </li>
	 * </ul>
	 */
	public static final ExoticOptionStyleCode DigitalOption = new ExoticOptionStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DigitalOption";
			definition = "Agreement under which a fixed amount is paid out if a specific condition is met on expiration date. The digital option has only \"payment triggers\" which may be single or double trigger level.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyleCode.mmObject();
			codeName = "DIGI";
		}
	};
	/**
	 * Agreement under which a fixed amount is paid unless a specific condition
	 * is met. The notouch option has only "no payment triggers" which may be
	 * single or double trigger levels.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode
	 * ExoticOptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOTO"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoTouchOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Agreement under which a fixed amount is paid unless a specific condition is met. The notouch option has only \"no payment triggers\" which may be single or double trigger levels."
	 * </li>
	 * </ul>
	 */
	public static final ExoticOptionStyleCode NoTouchOption = new ExoticOptionStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoTouchOption";
			definition = "Agreement under which a fixed amount is paid unless a specific condition is met. The notouch option has only \"no payment triggers\" which may be single or double trigger levels.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyleCode.mmObject();
			codeName = "NOTO";
		}
	};
	/**
	 * Contract that provides the buyer the right but not the obligation to buy
	 * or sell the underlying currency at a predetermined rate with expiration
	 * determined by the expiration style. The expiration style is European,
	 * American, Asian or Bermudan.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExoticOptionStyleCode
	 * ExoticOptionStyleCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VanillaOption"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Contract that provides the buyer the right but not the obligation to buy or sell the underlying currency at a predetermined rate with expiration determined by the expiration style. The expiration style is European, American, Asian or Bermudan."
	 * </li>
	 * </ul>
	 */
	public static final ExoticOptionStyleCode VanillaOption = new ExoticOptionStyleCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VanillaOption";
			definition = "Contract that provides the buyer the right but not the obligation to buy or sell the underlying currency at a predetermined rate with expiration determined by the expiration style. The expiration style is European, American, Asian or Bermudan.";
			owner_lazy = () -> com.tools20022.repository.codeset.ExoticOptionStyleCode.mmObject();
			codeName = "VANI";
		}
	};
	final static private LinkedHashMap<String, ExoticOptionStyleCode> codesByName = new LinkedHashMap<>();

	protected ExoticOptionStyleCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "ExoticOptionStyleCode";
				definition = "Specifies the option style.";
				derivation_lazy = () -> Arrays.asList(ExoticOptionStyle1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExoticOptionStyleCode.BinaryOption, com.tools20022.repository.codeset.ExoticOptionStyleCode.DigitalOption,
						com.tools20022.repository.codeset.ExoticOptionStyleCode.NoTouchOption, com.tools20022.repository.codeset.ExoticOptionStyleCode.VanillaOption);
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

	public static ExoticOptionStyleCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExoticOptionStyleCode[] values() {
		ExoticOptionStyleCode[] values = new ExoticOptionStyleCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExoticOptionStyleCode> {
		@Override
		public ExoticOptionStyleCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExoticOptionStyleCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}