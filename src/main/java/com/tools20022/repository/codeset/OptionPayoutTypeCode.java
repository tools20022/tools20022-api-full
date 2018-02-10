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
import com.tools20022.repository.codeset.OptionPayoutTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the type of payout that will result from an in-the-money option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode#Vanilla
 * OptionPayoutTypeCode.Vanilla}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode#Capped
 * OptionPayoutTypeCode.Capped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode#Binary
 * OptionPayoutTypeCode.Binary}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code
 * OptionPayoutType1Code}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "OptionPayoutTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of payout that will result from an in-the-money option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionPayoutTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Indicates the type of vanilla option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode
	 * OptionPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "VANI"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vanilla"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of vanilla option."</li>
	 * </ul>
	 */
	public static final OptionPayoutTypeCode Vanilla = new OptionPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vanilla";
			definition = "Indicates the type of vanilla option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutTypeCode.mmObject();
			codeName = "VANI";
		}
	};
	/**
	 * Indicates the type of capped option.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode
	 * OptionPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "CAPP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capped"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of capped option."</li>
	 * </ul>
	 */
	public static final OptionPayoutTypeCode Capped = new OptionPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capped";
			definition = "Indicates the type of capped option.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutTypeCode.mmObject();
			codeName = "CAPP";
		}
	};
	/**
	 * Indicates the type of binaryoption.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode
	 * OptionPayoutTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "BINA"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Binary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the type of binaryoption."</li>
	 * </ul>
	 */
	public static final OptionPayoutTypeCode Binary = new OptionPayoutTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Binary";
			definition = "Indicates the type of binaryoption.";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutTypeCode.mmObject();
			codeName = "BINA";
		}
	};
	final static private LinkedHashMap<String, OptionPayoutTypeCode> codesByName = new LinkedHashMap<>();

	protected OptionPayoutTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionPayoutTypeCode";
				definition = "Indicates the type of payout that will result from an in-the-money option.";
				derivation_lazy = () -> Arrays.asList(OptionPayoutType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.OptionPayoutTypeCode.Vanilla, com.tools20022.repository.codeset.OptionPayoutTypeCode.Capped, com.tools20022.repository.codeset.OptionPayoutTypeCode.Binary);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Vanilla.getCodeName().get(), Vanilla);
		codesByName.put(Capped.getCodeName().get(), Capped);
		codesByName.put(Binary.getCodeName().get(), Binary);
	}

	public static OptionPayoutTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionPayoutTypeCode[] values() {
		OptionPayoutTypeCode[] values = new OptionPayoutTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionPayoutTypeCode> {
		@Override
		public OptionPayoutTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionPayoutTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}