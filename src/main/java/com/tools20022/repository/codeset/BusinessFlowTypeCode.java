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
import com.tools20022.repository.codeset.BusinessFlowTypeCode.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Identifies the business process in which the actors are involved. This is
 * important to trigger the right business process, according to the market
 * business model, which may require matching instructions in a CSD environment
 * (double leg process) or not (single leg process).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode#SingleLegDeliveringParty
 * BusinessFlowTypeCode.SingleLegDeliveringParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode#SingleLegReceivingParty
 * BusinessFlowTypeCode.SingleLegReceivingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode#DoubleLegProcess
 * BusinessFlowTypeCode.DoubleLegProcess}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.BusinessFlowType1Code
 * BusinessFlowType1Code}</li>
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
 * <li>"SLDP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BusinessFlowTypeCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process)."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BusinessFlowTypeCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Single leg process initiated by the delivering party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode
	 * BusinessFlowTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLDP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleLegDeliveringParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Single leg process initiated by the delivering party."</li>
	 * </ul>
	 */
	public static final BusinessFlowTypeCode SingleLegDeliveringParty = new BusinessFlowTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleLegDeliveringParty";
			definition = "Single leg process initiated by the delivering party.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessFlowTypeCode.mmObject();
			codeName = "SLDP";
		}
	};
	/**
	 * Single leg process initiated by the receiving party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode
	 * BusinessFlowTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "SLRP"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SingleLegReceivingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Single leg process initiated by the receiving party."</li>
	 * </ul>
	 */
	public static final BusinessFlowTypeCode SingleLegReceivingParty = new BusinessFlowTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SingleLegReceivingParty";
			definition = "Single leg process initiated by the receiving party.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessFlowTypeCode.mmObject();
			codeName = "SLRP";
		}
	};
	/**
	 * Double leg process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowTypeCode
	 * BusinessFlowTypeCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLPR"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DoubleLegProcess"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Double leg process."</li>
	 * </ul>
	 */
	public static final BusinessFlowTypeCode DoubleLegProcess = new BusinessFlowTypeCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DoubleLegProcess";
			definition = "Double leg process.";
			owner_lazy = () -> com.tools20022.repository.codeset.BusinessFlowTypeCode.mmObject();
			codeName = "DLPR";
		}
	};
	final static private LinkedHashMap<String, BusinessFlowTypeCode> codesByName = new LinkedHashMap<>();

	protected BusinessFlowTypeCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("SLDP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BusinessFlowTypeCode";
				definition = "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process).";
				derivation_lazy = () -> Arrays.asList(BusinessFlowType1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BusinessFlowTypeCode.SingleLegDeliveringParty, com.tools20022.repository.codeset.BusinessFlowTypeCode.SingleLegReceivingParty,
						com.tools20022.repository.codeset.BusinessFlowTypeCode.DoubleLegProcess);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(SingleLegDeliveringParty.getCodeName().get(), SingleLegDeliveringParty);
		codesByName.put(SingleLegReceivingParty.getCodeName().get(), SingleLegReceivingParty);
		codesByName.put(DoubleLegProcess.getCodeName().get(), DoubleLegProcess);
	}

	public static BusinessFlowTypeCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BusinessFlowTypeCode[] values() {
		BusinessFlowTypeCode[] values = new BusinessFlowTypeCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BusinessFlowTypeCode> {
		@Override
		public BusinessFlowTypeCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BusinessFlowTypeCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}