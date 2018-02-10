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
import com.tools20022.repository.codeset.PositionEffect3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the order in which events are processed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect3Code#Fifo
 * PositionEffect3Code.Fifo}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.PositionEffect3Code#Lifo
 * PositionEffect3Code.Lifo}</li>
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PositionEffect3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the order in which events are processed."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class PositionEffect3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect3Code
	 * PositionEffect3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Fifo"</li>
	 * </ul>
	 */
	public static final PositionEffect3Code Fifo = new PositionEffect3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Fifo";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect3Code.mmObject();
			codeName = PositionEffectCode.Fifo.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.PositionEffect3Code
	 * PositionEffect3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Lifo"</li>
	 * </ul>
	 */
	public static final PositionEffect3Code Lifo = new PositionEffect3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Lifo";
			owner_lazy = () -> com.tools20022.repository.codeset.PositionEffect3Code.mmObject();
			codeName = PositionEffectCode.Lifo.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, PositionEffect3Code> codesByName = new LinkedHashMap<>();

	protected PositionEffect3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PositionEffect3Code";
				definition = "Specifies the order in which events are processed.";
				trace_lazy = () -> PositionEffectCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.PositionEffect3Code.Fifo, com.tools20022.repository.codeset.PositionEffect3Code.Lifo);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Fifo.getCodeName().get(), Fifo);
		codesByName.put(Lifo.getCodeName().get(), Lifo);
	}

	public static PositionEffect3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static PositionEffect3Code[] values() {
		PositionEffect3Code[] values = new PositionEffect3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, PositionEffect3Code> {
		@Override
		public PositionEffect3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(PositionEffect3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}