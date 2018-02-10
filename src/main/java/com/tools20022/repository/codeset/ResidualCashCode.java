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
import com.tools20022.repository.codeset.ResidualCashCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether there is cash in the account that is awaiting investment.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidualCashCode#ResidualCashTransfer
 * ResidualCashCode.ResidualCashTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidualCashCode#NotResidualCashTransfer
 * ResidualCashCode.NotResidualCashTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.ResidualCash1Code
 * ResidualCash1Code}</li>
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
 * <li>"RCTR"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResidualCashCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether there is cash in the account that is awaiting investment."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResidualCashCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Residual cash to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCashCode
	 * ResidualCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "RCTR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCashTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Residual cash to be transferred."</li>
	 * </ul>
	 */
	public static final ResidualCashCode ResidualCashTransfer = new ResidualCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashTransfer";
			definition = "Residual cash to be transferred.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidualCashCode.mmObject();
			codeName = "RCTR";
		}
	};
	/**
	 * Residual Cash not to be transferred.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCashCode
	 * ResidualCashCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NRCT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotResidualCashTransfer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Residual Cash not to be transferred."</li>
	 * </ul>
	 */
	public static final ResidualCashCode NotResidualCashTransfer = new ResidualCashCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotResidualCashTransfer";
			definition = "Residual Cash not to be transferred.";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidualCashCode.mmObject();
			codeName = "NRCT";
		}
	};
	final static private LinkedHashMap<String, ResidualCashCode> codesByName = new LinkedHashMap<>();

	protected ResidualCashCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RCTR");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResidualCashCode";
				definition = "Specifies whether there is cash in the account that is awaiting investment.";
				derivation_lazy = () -> Arrays.asList(ResidualCash1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResidualCashCode.ResidualCashTransfer, com.tools20022.repository.codeset.ResidualCashCode.NotResidualCashTransfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ResidualCashTransfer.getCodeName().get(), ResidualCashTransfer);
		codesByName.put(NotResidualCashTransfer.getCodeName().get(), NotResidualCashTransfer);
	}

	public static ResidualCashCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResidualCashCode[] values() {
		ResidualCashCode[] values = new ResidualCashCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResidualCashCode> {
		@Override
		public ResidualCashCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResidualCashCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}