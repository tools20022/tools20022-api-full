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
import com.tools20022.repository.codeset.PositionEffect1Code.InternalXmlAdapter;
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
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect1Code#Open
 * PositionEffect1Code.Open}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect1Code#Close
 * PositionEffect1Code.Close}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect1Code#Rolled
 * PositionEffect1Code.Rolled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect1Code#Fifo
 * PositionEffect1Code.Fifo}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.PositionEffectCode
 * PositionEffectCode}</li>
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
 * "PositionEffect1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the resulting position after a  trade should be an opening position or closing position."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PositionEffect1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Open"</li>
	 * </ul>
	 */
	public static final PositionEffect1Code Open = new PositionEffect1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Open";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect1Code.mmObject();
			codeName = PositionEffectCode.Open.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Close"</li>
	 * </ul>
	 */
	public static final PositionEffect1Code Close = new PositionEffect1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Close";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect1Code.mmObject();
			codeName = PositionEffectCode.Close.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rolled"</li>
	 * </ul>
	 */
	public static final PositionEffect1Code Rolled = new PositionEffect1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rolled";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect1Code.mmObject();
			codeName = PositionEffectCode.Rolled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect1Code
	 * PositionEffect1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fifo"</li>
	 * </ul>
	 */
	public static final PositionEffect1Code Fifo = new PositionEffect1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fifo";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect1Code.mmObject();
			codeName = PositionEffectCode.Fifo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PositionEffect1Code> codesByName = new LinkedHashMap<>();

	protected PositionEffect1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("OPEN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PositionEffect1Code";
				definition = "Indicates whether the resulting position after a  trade should be an opening position or closing position.";
				trace_lazy = () -> PositionEffectCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffect1Code.Open, com.tools20022.repository.codeset.PositionEffect1Code.Close, com.tools20022.repository.codeset.PositionEffect1Code.Rolled,
						com.tools20022.repository.codeset.PositionEffect1Code.Fifo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Open.getCodeName().get(), Open);
		codesByName.put(Close.getCodeName().get(), Close);
		codesByName.put(Rolled.getCodeName().get(), Rolled);
		codesByName.put(Fifo.getCodeName().get(), Fifo);
	}

	public static PositionEffect1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PositionEffect1Code[] values() {
		PositionEffect1Code[] values = new PositionEffect1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PositionEffect1Code> {
		@Override
		public PositionEffect1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PositionEffect1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}