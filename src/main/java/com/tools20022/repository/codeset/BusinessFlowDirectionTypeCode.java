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
import com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the business flow, in order to determine the role of the parties
 * in the business process. This indicator is very important when there are
 * multiple intermediaries in the exchange of information process.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode#AssetstoBeDelivered
 * BusinessFlowDirectionTypeCode.AssetstoBeDelivered}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode#AssetsToBeReceived
 * BusinessFlowDirectionTypeCode.AssetsToBeReceived}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionType1Code
 * BusinessFlowDirectionType1Code}</li>
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
 * <li>"ADLV"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessFlowDirectionTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the business flow, in order to determine the role of the parties in the business process. This indicator is very important when there are multiple intermediaries in the exchange of information process."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessFlowDirectionTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Assets to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode
	 * BusinessFlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADLV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetstoBeDelivered"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assets to be delivered."</li>
	 * </ul>
	 */
	public static final BusinessFlowDirectionTypeCode AssetstoBeDelivered = new BusinessFlowDirectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetstoBeDelivered";
			definition = "Assets to be delivered.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode.mmObject();
			codeName = "ADLV";
		}
	};
	/**
	 * Assets to be received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode
	 * BusinessFlowDirectionTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ARCV"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AssetsToBeReceived"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Assets to be received."</li>
	 * </ul>
	 */
	public static final BusinessFlowDirectionTypeCode AssetsToBeReceived = new BusinessFlowDirectionTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AssetsToBeReceived";
			definition = "Assets to be received.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode.mmObject();
			codeName = "ARCV";
		}
	};
	final static private LinkedHashMap<String, BusinessFlowDirectionTypeCode> codesByName = new LinkedHashMap<>();

	protected BusinessFlowDirectionTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("ADLV");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessFlowDirectionTypeCode";
				definition = "Identifies the business flow, in order to determine the role of the parties in the business process. This indicator is very important when there are multiple intermediaries in the exchange of information process.";
				derivation_lazy = () -> Arrays.asList(BusinessFlowDirectionType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode.AssetstoBeDelivered, com.tools20022.repository.codeset.BusinessFlowDirectionTypeCode.AssetsToBeReceived);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(AssetstoBeDelivered.getCodeName().get(), AssetstoBeDelivered);
		codesByName.put(AssetsToBeReceived.getCodeName().get(), AssetsToBeReceived);
	}

	public static BusinessFlowDirectionTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessFlowDirectionTypeCode[] values() {
		BusinessFlowDirectionTypeCode[] values = new BusinessFlowDirectionTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessFlowDirectionTypeCode> {
		@Override
		public BusinessFlowDirectionTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessFlowDirectionTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}