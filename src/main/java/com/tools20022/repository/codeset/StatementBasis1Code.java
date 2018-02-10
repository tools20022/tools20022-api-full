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
import com.tools20022.repository.codeset.StatementBasis1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the type of balances on which the statement is prepared.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code#Contractual
 * StatementBasis1Code.Contractual}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code#Settled
 * StatementBasis1Code.Settled}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.StatementBasis1Code#Traded
 * StatementBasis1Code.Traded}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.StatementBasisCode
 * StatementBasisCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"CONT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "StatementBasis1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the type of balances on which the statement is prepared."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class StatementBasis1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code
	 * StatementBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Contractual"</li>
	 * </ul>
	 */
	public static final StatementBasis1Code Contractual = new StatementBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Contractual";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementBasis1Code.mmObject();
			codeName = StatementBasisCode.Contractual.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code
	 * StatementBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Settled"</li>
	 * </ul>
	 */
	public static final StatementBasis1Code Settled = new StatementBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Settled";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementBasis1Code.mmObject();
			codeName = StatementBasisCode.Settled.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.StatementBasis1Code
	 * StatementBasis1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traded"</li>
	 * </ul>
	 */
	public static final StatementBasis1Code Traded = new StatementBasis1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traded";
			owner_lazy = () -> com.tools20022.repository.codeset.StatementBasis1Code.mmObject();
			codeName = StatementBasisCode.Traded.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, StatementBasis1Code> codesByName = new LinkedHashMap<>();

	protected StatementBasis1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("CONT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "StatementBasis1Code";
				definition = "Specifies the type of balances on which the statement is prepared.";
				trace_lazy = () -> StatementBasisCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.StatementBasis1Code.Contractual, com.tools20022.repository.codeset.StatementBasis1Code.Settled, com.tools20022.repository.codeset.StatementBasis1Code.Traded);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Contractual.getCodeName().get(), Contractual);
		codesByName.put(Settled.getCodeName().get(), Settled);
		codesByName.put(Traded.getCodeName().get(), Traded);
	}

	public static StatementBasis1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static StatementBasis1Code[] values() {
		StatementBasis1Code[] values = new StatementBasis1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, StatementBasis1Code> {
		@Override
		public StatementBasis1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(StatementBasis1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}