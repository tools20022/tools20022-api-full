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
import com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.InternalXmlAdapter;
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
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode#Preliminary
 * DerivativeWorkflowStatusCode.Preliminary}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode#Adjustment
 * DerivativeWorkflowStatusCode.Adjustment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode#NoAction
 * DerivativeWorkflowStatusCode.NoAction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode#Unconfirmed
 * DerivativeWorkflowStatusCode.Unconfirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode#Deleted
 * DerivativeWorkflowStatusCode.Deleted}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getDerivation derivation}
 * =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatus1Code
 * DerivativeWorkflowStatus1Code}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "DerivativeWorkflowStatusCode"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the status of exchange's notice of change on a derivative."</li>
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
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class DerivativeWorkflowStatusCode extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * Notice is an advance warning that an adjustment may be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
	 * DerivativeWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "PREL"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Preliminary"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Notice is an advance warning that an adjustment may be applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatusCode Preliminary = new DerivativeWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Preliminary";
			definition = "Notice is an advance warning that an adjustment may be applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.mmObject();
			codeName = "PREL";
		}
	};
	/**
	 * Notice confirms that an adjustment will be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
	 * DerivativeWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "ADJU"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Adjustment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice confirms that an adjustment will be applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatusCode Adjustment = new DerivativeWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Adjustment";
			definition = "Notice confirms that an adjustment will be applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.mmObject();
			codeName = "ADJU";
		}
	};
	/**
	 * Notice confirms that no adjustment will be applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
	 * DerivativeWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "NOAC"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Notice confirms that no adjustment will be applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatusCode NoAction = new DerivativeWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "Notice confirms that no adjustment will be applied.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.mmObject();
			codeName = "NOAC";
		}
	};
	/**
	 * GCA VS (Global Corporate Actions Validation Service) is unable to confirm
	 * that there is a corporate action corresponding to this notice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
	 * DerivativeWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "UCON"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unconfirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "GCA VS (Global Corporate Actions Validation Service) is unable to confirm that there is a corporate action corresponding to this notice."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatusCode Unconfirmed = new DerivativeWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unconfirmed";
			definition = "GCA VS (Global Corporate Actions Validation Service) is unable to confirm that there is a corporate action corresponding to this notice.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.mmObject();
			codeName = "UCON";
		}
	};
	/**
	 * Details were entered in error. All data should be ignored.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.DerivativeWorkflowStatusCode
	 * DerivativeWorkflowStatusCode}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getCodeName codeName} =
	 * "DLTD"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Deleted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details were entered in error. All data should be ignored."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final DerivativeWorkflowStatusCode Deleted = new DerivativeWorkflowStatusCode() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Deleted";
			definition = "Details were entered in error. All data should be ignored.";
			owner_lazy = () -> com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.mmObject();
			codeName = "DLTD";
		}
	};
	final static private LinkedHashMap<String, DerivativeWorkflowStatusCode> codesByName = new LinkedHashMap<>();

	protected DerivativeWorkflowStatusCode() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PREL");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "DerivativeWorkflowStatusCode";
				definition = "Specifies the status of exchange's notice of change on a derivative.";
				derivation_lazy = () -> Arrays.asList(DerivativeWorkflowStatus1Code.mmObject());
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.Preliminary, com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.Adjustment,
						com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.NoAction, com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.Unconfirmed,
						com.tools20022.repository.codeset.DerivativeWorkflowStatusCode.Deleted);
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

	public static DerivativeWorkflowStatusCode valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static DerivativeWorkflowStatusCode[] values() {
		DerivativeWorkflowStatusCode[] values = new DerivativeWorkflowStatusCode[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, DerivativeWorkflowStatusCode> {
		@Override
		public DerivativeWorkflowStatusCode unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(DerivativeWorkflowStatusCode codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}