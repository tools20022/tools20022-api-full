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
import com.tools20022.repository.codeset.Holding1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies how the holding is blocked.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.Holding1Code#Certificate
 * Holding1Code.Certificate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Holding1Code#NonPartialHolding
 * Holding1Code.NonPartialHolding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.Holding1Code#PartialHolding
 * Holding1Code.PartialHolding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.HoldingCode HoldingCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CERT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Holding1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies how the holding is blocked."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class Holding1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Holding1Code Holding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Certificate"</li>
	 * </ul>
	 */
	public static final Holding1Code Certificate = new Holding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Certificate";
			owner_lazy = () -> com.tools20022.repository.codeset.Holding1Code.mmObject();
			codeName = HoldingCode.Certificate.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Holding1Code Holding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonPartialHolding"</li>
	 * </ul>
	 */
	public static final Holding1Code NonPartialHolding = new Holding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonPartialHolding";
			owner_lazy = () -> com.tools20022.repository.codeset.Holding1Code.mmObject();
			codeName = HoldingCode.NonPartialHolding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.Holding1Code Holding1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialHolding"</li>
	 * </ul>
	 */
	public static final Holding1Code PartialHolding = new Holding1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialHolding";
			owner_lazy = () -> com.tools20022.repository.codeset.Holding1Code.mmObject();
			codeName = HoldingCode.PartialHolding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, Holding1Code> codesByName = new LinkedHashMap<>();

	protected Holding1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CERT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Holding1Code";
				definition = "Specifies how the holding is blocked.";
				trace_lazy = () -> HoldingCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.Holding1Code.Certificate, com.tools20022.repository.codeset.Holding1Code.NonPartialHolding, com.tools20022.repository.codeset.Holding1Code.PartialHolding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Certificate.getCodeName().get(), Certificate);
		codesByName.put(NonPartialHolding.getCodeName().get(), NonPartialHolding);
		codesByName.put(PartialHolding.getCodeName().get(), PartialHolding);
	}

	public static Holding1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static Holding1Code[] values() {
		Holding1Code[] values = new Holding1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, Holding1Code> {
		@Override
		public Holding1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(Holding1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}