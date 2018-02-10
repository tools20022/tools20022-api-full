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
import com.tools20022.repository.codeset.Quantity4Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies quantity of a financial instrument
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Quantity4Code#UnknownQuantity
 * Quantity4Code.UnknownQuantity}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.Quantity4Code#AnyAndAll
 * Quantity4Code.AnyAndAll}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.QuantityCode QuantityCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"UKWN"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Quantity4Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies quantity of a financial instrument"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Quantity5Code
 * Quantity5Code}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.codeset.Quantity3Code Quantity3Code}</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Quantity4Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity4Code
	 * Quantity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnknownQuantity"</li>
	 * </ul>
	 */
	public static final Quantity4Code UnknownQuantity = new Quantity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnknownQuantity";
			owner_lazy = () -> com.tools20022.repository.codeset.Quantity4Code.mmObject();
			codeName = QuantityCode.UnknownQuantity.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Quantity4Code
	 * Quantity4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AnyAndAll"</li>
	 * </ul>
	 */
	public static final Quantity4Code AnyAndAll = new Quantity4Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AnyAndAll";
			owner_lazy = () -> com.tools20022.repository.codeset.Quantity4Code.mmObject();
			codeName = QuantityCode.AnyAndAll.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Quantity4Code> codesByName = new LinkedHashMap<>();

	protected Quantity4Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("UKWN");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Quantity4Code";
				definition = "Specifies quantity of a financial instrument";
				nextVersions_lazy = () -> Arrays.asList(Quantity5Code.mmObject());
				previousVersion_lazy = () -> Quantity3Code.mmObject();
				trace_lazy = () -> QuantityCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Quantity4Code.UnknownQuantity, com.tools20022.repository.codeset.Quantity4Code.AnyAndAll);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(UnknownQuantity.getCodeName().get(), UnknownQuantity);
		codesByName.put(AnyAndAll.getCodeName().get(), AnyAndAll);
	}

	public static Quantity4Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Quantity4Code[] values() {
		Quantity4Code[] values = new Quantity4Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Quantity4Code> {
		@Override
		public Quantity4Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Quantity4Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}