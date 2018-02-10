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
import com.tools20022.repository.codeset.OptionPayoutType1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code#Binary
 * OptionPayoutType1Code.Binary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code#Capped
 * OptionPayoutType1Code.Capped}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code#Vanilla
 * OptionPayoutType1Code.Vanilla}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.OptionPayoutTypeCode
 * OptionPayoutTypeCode}</li>
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
 * "OptionPayoutType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates the type of payout that will result from an in-the-money option."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class OptionPayoutType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code
	 * OptionPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Binary"</li>
	 * </ul>
	 */
	public static final OptionPayoutType1Code Binary = new OptionPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Binary";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutType1Code.mmObject();
			codeName = OptionPayoutTypeCode.Binary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code
	 * OptionPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Capped"</li>
	 * </ul>
	 */
	public static final OptionPayoutType1Code Capped = new OptionPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Capped";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutType1Code.mmObject();
			codeName = OptionPayoutTypeCode.Capped.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.OptionPayoutType1Code
	 * OptionPayoutType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Vanilla"</li>
	 * </ul>
	 */
	public static final OptionPayoutType1Code Vanilla = new OptionPayoutType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Vanilla";
			owner_lazy = () -> com.tools20022.repository.codeset.OptionPayoutType1Code.mmObject();
			codeName = OptionPayoutTypeCode.Vanilla.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, OptionPayoutType1Code> codesByName = new LinkedHashMap<>();

	protected OptionPayoutType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "OptionPayoutType1Code";
				definition = "Indicates the type of payout that will result from an in-the-money option.";
				trace_lazy = () -> OptionPayoutTypeCode.mmObject();
				code_lazy = () -> Arrays
						.asList(com.tools20022.repository.codeset.OptionPayoutType1Code.Binary, com.tools20022.repository.codeset.OptionPayoutType1Code.Capped, com.tools20022.repository.codeset.OptionPayoutType1Code.Vanilla);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Binary.getCodeName().get(), Binary);
		codesByName.put(Capped.getCodeName().get(), Capped);
		codesByName.put(Vanilla.getCodeName().get(), Vanilla);
	}

	public static OptionPayoutType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static OptionPayoutType1Code[] values() {
		OptionPayoutType1Code[] values = new OptionPayoutType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, OptionPayoutType1Code> {
		@Override
		public OptionPayoutType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(OptionPayoutType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}