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
import com.tools20022.repository.codeset.POIComponentStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Status of a component belonging to a POI Terminal (Point of Interaction).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code#WaitingActivation
 * POIComponentStatus1Code.WaitingActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code#OutOfOrder
 * POIComponentStatus1Code.OutOfOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code#InOperation
 * POIComponentStatus1Code.InOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code#Deactivated
 * POIComponentStatus1Code.Deactivated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode
 * POIComponentStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"WAIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a component belonging to a POI Terminal (Point of Interaction)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
	 * POIComponentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingActivation"</li>
	 * </ul>
	 */
	public static final POIComponentStatus1Code WaitingActivation = new POIComponentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WaitingActivation";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatus1Code.mmObject();
			codeName = POIComponentStatusCode.WaitingActivation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
	 * POIComponentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfOrder"</li>
	 * </ul>
	 */
	public static final POIComponentStatus1Code OutOfOrder = new POIComponentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OutOfOrder";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatus1Code.mmObject();
			codeName = POIComponentStatusCode.OutOfOrder.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
	 * POIComponentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InOperation"</li>
	 * </ul>
	 */
	public static final POIComponentStatus1Code InOperation = new POIComponentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InOperation";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatus1Code.mmObject();
			codeName = POIComponentStatusCode.InOperation.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
	 * POIComponentStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * </ul>
	 */
	public static final POIComponentStatus1Code Deactivated = new POIComponentStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deactivated";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatus1Code.mmObject();
			codeName = POIComponentStatusCode.Deactivated.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, POIComponentStatus1Code> codesByName = new LinkedHashMap<>();

	protected POIComponentStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WAIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentStatus1Code";
				definition = "Status of a component belonging to a POI Terminal (Point of Interaction).";
				trace_lazy = () -> POIComponentStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentStatus1Code.WaitingActivation, com.tools20022.repository.codeset.POIComponentStatus1Code.OutOfOrder,
						com.tools20022.repository.codeset.POIComponentStatus1Code.InOperation, com.tools20022.repository.codeset.POIComponentStatus1Code.Deactivated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WaitingActivation.getCodeName().get(), WaitingActivation);
		codesByName.put(OutOfOrder.getCodeName().get(), OutOfOrder);
		codesByName.put(InOperation.getCodeName().get(), InOperation);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
	}

	public static POIComponentStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentStatus1Code[] values() {
		POIComponentStatus1Code[] values = new POIComponentStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentStatus1Code> {
		@Override
		public POIComponentStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}