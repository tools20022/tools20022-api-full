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
import com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies the status of exchange's notice of change on a derivative.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code#Preliminary
 * DerivativeWorkflowStatus1Code.Preliminary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code#Adjustment
 * DerivativeWorkflowStatus1Code.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code#NoAction
 * DerivativeWorkflowStatus1Code.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code#Unconfirmed
 * DerivativeWorkflowStatus1Code.Unconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code#Deleted
 * DerivativeWorkflowStatus1Code.Deleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
 * DerivativeWorkflowStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PREL"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativeWorkflowStatus1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of exchange's notice of change on a derivative."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DerivativeWorkflowStatus1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preliminary"</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatus1Code Preliminary = new DerivativeWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Preliminary";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.mmObject();
			codeName = DerivativeWorkflowStatusCode.Preliminary.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatus1Code Adjustment = new DerivativeWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.mmObject();
			codeName = DerivativeWorkflowStatusCode.Adjustment.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatus1Code NoAction = new DerivativeWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.mmObject();
			codeName = DerivativeWorkflowStatusCode.NoAction.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatus1Code Unconfirmed = new DerivativeWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unconfirmed";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.mmObject();
			codeName = DerivativeWorkflowStatusCode.Unconfirmed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
	 * DerivativeWorkflowStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatus1Code Deleted = new DerivativeWorkflowStatus1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.mmObject();
			codeName = DerivativeWorkflowStatusCode.Deleted.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, DerivativeWorkflowStatus1Code> codesByName = new LinkedHashMap<>();

	protected DerivativeWorkflowStatus1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PREL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeWorkflowStatus1Code";
				definition = "Specifies the status of exchange's notice of change on a derivative.";
				trace_lazy = () -> DerivativeWorkflowStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.Preliminary, com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.Adjustment,
						com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.NoAction, com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.Unconfirmed,
						com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code.Deleted);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Preliminary.getCodeName().get(), Preliminary);
		codesByName.put(Adjustment.getCodeName().get(), Adjustment);
		codesByName.put(NoAction.getCodeName().get(), NoAction);
		codesByName.put(Unconfirmed.getCodeName().get(), Unconfirmed);
		codesByName.put(Deleted.getCodeName().get(), Deleted);
	}

	public static DerivativeWorkflowStatus1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DerivativeWorkflowStatus1Code[] values() {
		DerivativeWorkflowStatus1Code[] values = new DerivativeWorkflowStatus1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DerivativeWorkflowStatus1Code> {
		@Override
		public DerivativeWorkflowStatus1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DerivativeWorkflowStatus1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}