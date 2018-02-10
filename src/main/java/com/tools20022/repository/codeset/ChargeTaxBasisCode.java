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
import com.tools20022.repository.codeset.ChargeTaxBasisCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasisCode#FlatOrAbsolute
 * ChargeTaxBasisCode.FlatOrAbsolute}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTaxBasisCode#PerUnit
 * ChargeTaxBasisCode.PerUnit}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ChargeTaxBasis1Code
 * ChargeTaxBasis1Code}</li>
 * </ul>
 * </li>
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
 * "ChargeTaxBasisCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Define the Charges/tax basis for the trade being allocated."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ChargeTaxBasisCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Charges/tax basis is flat or absolute for the trade being allocated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasisCode
	 * ChargeTaxBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "FLAT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FlatOrAbsolute"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Charges/tax basis is flat or absolute for the trade being allocated."</li>
	 * </ul>
	 */
	public static final ChargeTaxBasisCode FlatOrAbsolute = new ChargeTaxBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FlatOrAbsolute";
			definition = "Charges/tax basis is flat or absolute for the trade being allocated.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeTaxBasisCode.mmObject();
			codeName = "FLAT";
		}
	};
	/**
	 * Charge/tax basis is per unit of financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ChargeTaxBasisCode
	 * ChargeTaxBasisCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PERU"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PerUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge/tax basis is per unit of financial instrument."</li>
	 * </ul>
	 */
	public static final ChargeTaxBasisCode PerUnit = new ChargeTaxBasisCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PerUnit";
			definition = "Charge/tax basis is per unit of financial instrument.";
			owner_lazy = () -> com.tools20022.repository.codeset.ChargeTaxBasisCode.mmObject();
			codeName = "PERU";
		}
	};
	final static private LinkedHashMap<String, ChargeTaxBasisCode> codesByName = new LinkedHashMap<>();

	protected ChargeTaxBasisCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("FLAT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ChargeTaxBasisCode";
				definition = "Define the Charges/tax basis for the trade being allocated.";
				derivation_lazy = () -> Arrays.asList(ChargeTaxBasis1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ChargeTaxBasisCode.FlatOrAbsolute, com.tools20022.repository.codeset.ChargeTaxBasisCode.PerUnit);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(FlatOrAbsolute.getCodeName().get(), FlatOrAbsolute);
		codesByName.put(PerUnit.getCodeName().get(), PerUnit);
	}

	public static ChargeTaxBasisCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ChargeTaxBasisCode[] values() {
		ChargeTaxBasisCode[] values = new ChargeTaxBasisCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ChargeTaxBasisCode> {
		@Override
		public ChargeTaxBasisCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ChargeTaxBasisCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}