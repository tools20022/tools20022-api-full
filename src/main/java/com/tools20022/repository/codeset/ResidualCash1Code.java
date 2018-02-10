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
import com.tools20022.repository.codeset.ResidualCash1Code.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code#NotResidualCashTransfer
 * ResidualCash1Code.NotResidualCashTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code#ResidualCashTransfer
 * ResidualCash1Code.ResidualCashTransfer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ResidualCashCode
 * ResidualCashCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"NRCT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ResidualCash1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether there is cash in the account that is awaiting investment."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ResidualCash1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code
	 * ResidualCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotResidualCashTransfer"</li>
	 * </ul>
	 */
	public static final ResidualCash1Code NotResidualCashTransfer = new ResidualCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotResidualCashTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidualCash1Code.mmObject();
			codeName = ResidualCashCode.NotResidualCashTransfer.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ResidualCash1Code
	 * ResidualCash1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResidualCashTransfer"</li>
	 * </ul>
	 */
	public static final ResidualCash1Code ResidualCashTransfer = new ResidualCash1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResidualCashTransfer";
			owner_lazy = () -> com.tools20022.repository.codeset.ResidualCash1Code.mmObject();
			codeName = ResidualCashCode.ResidualCashTransfer.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ResidualCash1Code> codesByName = new LinkedHashMap<>();

	protected ResidualCash1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("NRCT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ResidualCash1Code";
				definition = "Specifies whether there is cash in the account that is awaiting investment.";
				trace_lazy = () -> ResidualCashCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ResidualCash1Code.NotResidualCashTransfer, com.tools20022.repository.codeset.ResidualCash1Code.ResidualCashTransfer);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(NotResidualCashTransfer.getCodeName().get(), NotResidualCashTransfer);
		codesByName.put(ResidualCashTransfer.getCodeName().get(), ResidualCashTransfer);
	}

	public static ResidualCash1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ResidualCash1Code[] values() {
		ResidualCash1Code[] values = new ResidualCash1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ResidualCash1Code> {
		@Override
		public ResidualCash1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ResidualCash1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}