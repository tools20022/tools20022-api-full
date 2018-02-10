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
import com.tools20022.repository.codeset.CorporateActionStatementTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates whether the statement contains missing instructions only or all
 * instructions.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementTypeCode#Missing
 * CorporateActionStatementTypeCode.Missing}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementTypeCode#All
 * CorporateActionStatementTypeCode.All}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementType1Code
 * CorporateActionStatementType1Code}</li>
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
 * <li>"MISS"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CorporateActionStatementTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Indicates whether the statement contains missing instructions only or all instructions."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class CorporateActionStatementTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Statement contains missing instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementTypeCode
	 * CorporateActionStatementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "MISS"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Missing"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement contains missing instructions."</li>
	 * </ul>
	 */
	public static final CorporateActionStatementTypeCode Missing = new CorporateActionStatementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Missing";
			definition = "Statement contains missing instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementTypeCode.mmObject();
			codeName = "MISS";
		}
	};
	/**
	 * Statement contains all instructions.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionStatementTypeCode
	 * CorporateActionStatementTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ALLL"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "All"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Statement contains all instructions."</li>
	 * </ul>
	 */
	public static final CorporateActionStatementTypeCode All = new CorporateActionStatementTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "All";
			definition = "Statement contains all instructions.";
			owner_lazy = () -> com.tools20022.repository.codeset.CorporateActionStatementTypeCode.mmObject();
			codeName = "ALLL";
		}
	};
	final static private LinkedHashMap<String, CorporateActionStatementTypeCode> codesByName = new LinkedHashMap<>();

	protected CorporateActionStatementTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("MISS");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CorporateActionStatementTypeCode";
				definition = "Indicates whether the statement contains missing instructions only or all instructions.";
				derivation_lazy = () -> Arrays.asList(CorporateActionStatementType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.CorporateActionStatementTypeCode.Missing, com.tools20022.repository.codeset.CorporateActionStatementTypeCode.All);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Missing.getCodeName().get(), Missing);
		codesByName.put(All.getCodeName().get(), All);
	}

	public static CorporateActionStatementTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static CorporateActionStatementTypeCode[] values() {
		CorporateActionStatementTypeCode[] values = new CorporateActionStatementTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, CorporateActionStatementTypeCode> {
		@Override
		public CorporateActionStatementTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(CorporateActionStatementTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}