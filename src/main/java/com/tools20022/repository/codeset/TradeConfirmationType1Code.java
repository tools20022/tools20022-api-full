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
import com.tools20022.repository.codeset.TradeConfirmationType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies whether the contract was electronically confirmed,
 * non-electronically confirmed.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationType1Code#ElectronicallyConfirmed
 * TradeConfirmationType1Code.ElectronicallyConfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationType1Code#NonElectronicallyConfirmed
 * TradeConfirmationType1Code.NonElectronicallyConfirmed}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationTypeCode
 * TradeConfirmationTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradeConfirmationType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies whether the contract was electronically confirmed, non-electronically confirmed."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class TradeConfirmationType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationType1Code
	 * TradeConfirmationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ElectronicallyConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationType1Code ElectronicallyConfirmed = new TradeConfirmationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ElectronicallyConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationType1Code.mmObject();
			codeName = TradeConfirmationTypeCode.ElectronicallyConfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.TradeConfirmationType1Code
	 * TradeConfirmationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonElectronicallyConfirmed"</li>
	 * </ul>
	 */
	public static final TradeConfirmationType1Code NonElectronicallyConfirmed = new TradeConfirmationType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonElectronicallyConfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.TradeConfirmationType1Code.mmObject();
			codeName = TradeConfirmationTypeCode.NonElectronicallyConfirmed.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, TradeConfirmationType1Code> codesByName = new LinkedHashMap<>();

	protected TradeConfirmationType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TradeConfirmationType1Code";
				definition = "Specifies whether the contract was electronically confirmed, non-electronically confirmed.";
				trace_lazy = () -> TradeConfirmationTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.TradeConfirmationType1Code.ElectronicallyConfirmed, com.tools20022.repository.codeset.TradeConfirmationType1Code.NonElectronicallyConfirmed);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(ElectronicallyConfirmed.getCodeName().get(), ElectronicallyConfirmed);
		codesByName.put(NonElectronicallyConfirmed.getCodeName().get(), NonElectronicallyConfirmed);
	}

	public static TradeConfirmationType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static TradeConfirmationType1Code[] values() {
		TradeConfirmationType1Code[] values = new TradeConfirmationType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, TradeConfirmationType1Code> {
		@Override
		public TradeConfirmationType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(TradeConfirmationType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}