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
import com.tools20022.repository.codeset.PositionEffect2Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the resulting position after a trade should be an opening
 * position or closing position.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code#OpenPosition
 * PositionEffect2Code.OpenPosition}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code#ClosePosition
 * PositionEffect2Code.ClosePosition}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect2Code#Rolled
 * PositionEffect2Code.Rolled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect2Code#Fifo
 * PositionEffect2Code.Fifo}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code#CloseAccount
 * PositionEffect2Code.CloseAccount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PositionEffectV2Code
 * PositionEffectV2Code}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"OPEN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PositionEffect2Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the resulting position after a trade should be an opening position or closing position."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PositionEffect2Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenPosition"</li>
	 * </ul>
	 */
	public static final PositionEffect2Code OpenPosition = new PositionEffect2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenPosition";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect2Code.mmObject();
			codeName = PositionEffectV2Code.OpenPosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClosePosition"</li>
	 * </ul>
	 */
	public static final PositionEffect2Code ClosePosition = new PositionEffect2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClosePosition";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect2Code.mmObject();
			codeName = PositionEffectV2Code.ClosePosition.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rolled"</li>
	 * </ul>
	 */
	public static final PositionEffect2Code Rolled = new PositionEffect2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rolled";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect2Code.mmObject();
			codeName = PositionEffectV2Code.Rolled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fifo"</li>
	 * </ul>
	 */
	public static final PositionEffect2Code Fifo = new PositionEffect2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fifo";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect2Code.mmObject();
			codeName = PositionEffectV2Code.Fifo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect2Code
	 * PositionEffect2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseAccount"</li>
	 * </ul>
	 */
	public static final PositionEffect2Code CloseAccount = new PositionEffect2Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseAccount";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect2Code.mmObject();
			codeName = PositionEffectV2Code.CloseAccount.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PositionEffect2Code> codesByName = new LinkedHashMap<>();

	protected PositionEffect2Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PositionEffect2Code";
				definition = "Indicates whether the resulting position after a trade should be an opening position or closing position.";
				trace_lazy = () -> PositionEffectV2Code.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffect2Code.OpenPosition, com.tools20022.repository.codeset.PositionEffect2Code.ClosePosition,
						com.tools20022.repository.codeset.PositionEffect2Code.Rolled, com.tools20022.repository.codeset.PositionEffect2Code.Fifo, com.tools20022.repository.codeset.PositionEffect2Code.CloseAccount);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(OpenPosition.getCodeName().get(), OpenPosition);
		codesByName.put(ClosePosition.getCodeName().get(), ClosePosition);
		codesByName.put(Rolled.getCodeName().get(), Rolled);
		codesByName.put(Fifo.getCodeName().get(), Fifo);
		codesByName.put(CloseAccount.getCodeName().get(), CloseAccount);
	}

	public static PositionEffect2Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PositionEffect2Code[] values() {
		PositionEffect2Code[] values = new PositionEffect2Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PositionEffect2Code> {
		@Override
		public PositionEffect2Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PositionEffect2Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}