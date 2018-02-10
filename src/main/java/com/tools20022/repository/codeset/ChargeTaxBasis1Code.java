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
import com.tools20022.repository.codeset.ChargeTaxBasis1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Define the Charges/tax basis for the trade being allocated.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasis1Code#FlatOrAbsolute
 * ChargeTaxBasis1Code.FlatOrAbsolute}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasis1Code#PerUnit
 * ChargeTaxBasis1Code.PerUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasisCode
 * ChargeTaxBasisCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"FLAT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ChargeTaxBasis1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Define the Charges/tax basis for the trade being allocated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeTaxBasis1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasis1Code
	 * ChargeTaxBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatOrAbsolute"</li>
	 * </ul>
	 */
	public static final ChargeTaxBasis1Code FlatOrAbsolute = new ChargeTaxBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatOrAbsolute";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeTaxBasis1Code.mmObject();
			codeName = ChargeTaxBasisCode.FlatOrAbsolute.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasis1Code
	 * ChargeTaxBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * </ul>
	 */
	public static final ChargeTaxBasis1Code PerUnit = new ChargeTaxBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeTaxBasis1Code.mmObject();
			codeName = ChargeTaxBasisCode.PerUnit.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ChargeTaxBasis1Code> codesByName = new LinkedHashMap<>();

	protected ChargeTaxBasis1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FLAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeTaxBasis1Code";
				definition = "Define the Charges/tax basis for the trade being allocated.";
				trace_lazy = () -> ChargeTaxBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeTaxBasis1Code.FlatOrAbsolute, com.tools20022.repository.codeset.ChargeTaxBasis1Code.PerUnit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FlatOrAbsolute.getCodeName().get(), FlatOrAbsolute);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
	}

	public static ChargeTaxBasis1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeTaxBasis1Code[] values() {
		ChargeTaxBasis1Code[] values = new ChargeTaxBasis1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeTaxBasis1Code> {
		@Override
		public ChargeTaxBasis1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeTaxBasis1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}