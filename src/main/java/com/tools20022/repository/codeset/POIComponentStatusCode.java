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
import com.tools20022.repository.codeset.POIComponentStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode#WaitingActivation
 * POIComponentStatusCode.WaitingActivation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode#InOperation
 * POIComponentStatusCode.InOperation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode#OutOfOrder
 * POIComponentStatusCode.OutOfOrder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode#Deactivated
 * POIComponentStatusCode.Deactivated}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.codeset.POIComponentStatus1Code
 * POIComponentStatus1Code}</li>
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
 * <li>"WAIT"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "POIComponentStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status of a component belonging to a POI Terminal (Point of Interaction)."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class POIComponentStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Component not yet activated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode
	 * POIComponentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "WAIT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WaitingActivation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component not yet activated."</li>
	 * </ul>
	 */
	public static final POIComponentStatusCode WaitingActivation = new POIComponentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "WaitingActivation";
			definition = "Component not yet activated.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatusCode.mmObject();
			codeName = "WAIT";
		}
	};
	/**
	 * Component activated and in operation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode
	 * POIComponentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OPER"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InOperation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component activated and in operation."</li>
	 * </ul>
	 */
	public static final POIComponentStatusCode InOperation = new POIComponentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "InOperation";
			definition = "Component activated and in operation.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatusCode.mmObject();
			codeName = "OPER";
		}
	};
	/**
	 * Component not working properly.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode
	 * POIComponentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "OUTD"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OutOfOrder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component not working properly."</li>
	 * </ul>
	 */
	public static final POIComponentStatusCode OutOfOrder = new POIComponentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "OutOfOrder";
			definition = "Component not working properly.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatusCode.mmObject();
			codeName = "OUTD";
		}
	};
	/**
	 * Component has been deactivated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.POIComponentStatusCode
	 * POIComponentStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DACT"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deactivated"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Component has been deactivated."</li>
	 * </ul>
	 */
	public static final POIComponentStatusCode Deactivated = new POIComponentStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.REGISTERED;
			name = "Deactivated";
			definition = "Component has been deactivated.";
			owner_lazy = () -> com.tools20022.repository.codeset.POIComponentStatusCode.mmObject();
			codeName = "DACT";
		}
	};
	final static private LinkedHashMap<String, POIComponentStatusCode> codesByName = new LinkedHashMap<>();

	protected POIComponentStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("WAIT");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "POIComponentStatusCode";
				definition = "Status of a component belonging to a POI Terminal (Point of Interaction).";
				derivation_lazy = () -> Arrays.asList(POIComponentStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.POIComponentStatusCode.WaitingActivation, com.tools20022.repository.codeset.POIComponentStatusCode.InOperation,
						com.tools20022.repository.codeset.POIComponentStatusCode.OutOfOrder, com.tools20022.repository.codeset.POIComponentStatusCode.Deactivated);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(WaitingActivation.getCodeName().get(), WaitingActivation);
		codesByName.put(InOperation.getCodeName().get(), InOperation);
		codesByName.put(OutOfOrder.getCodeName().get(), OutOfOrder);
		codesByName.put(Deactivated.getCodeName().get(), Deactivated);
	}

	public static POIComponentStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static POIComponentStatusCode[] values() {
		POIComponentStatusCode[] values = new POIComponentStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, POIComponentStatusCode> {
		@Override
		public POIComponentStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(POIComponentStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}