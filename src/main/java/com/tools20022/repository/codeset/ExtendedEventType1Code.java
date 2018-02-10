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
import com.tools20022.repository.codeset.ExtendedEventType1Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Specifies DTCC (The Depository Trust and Clearing Corporation) defined
 * corporate action event type.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#RightsPlanAdoption
 * ExtendedEventType1Code.RightsPlanAdoption}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#Termination
 * ExtendedEventType1Code.Termination}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#BonusRightsIssue
 * ExtendedEventType1Code.BonusRightsIssue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#FullPrerefunding
 * ExtendedEventType1Code.FullPrerefunding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#PartialDefeasance
 * ExtendedEventType1Code.PartialDefeasance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code#PartialPrerefunding
 * ExtendedEventType1Code.PartialPrerefunding}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.ExtendedEventTypeCode
 * ExtendedEventTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"RPLA"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ExtendedEventType1Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class ExtendedEventType1Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RightsPlanAdoption"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code RightsPlanAdoption = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RightsPlanAdoption";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.RightsPlanAdoption.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Termination"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code Termination = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Termination";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.Termination.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BonusRightsIssue"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code BonusRightsIssue = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BonusRightsIssue";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.BonusRightsIssue.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FullPrerefunding"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code FullPrerefunding = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FullPrerefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.FullPrerefunding.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialDefeasance"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code PartialDefeasance = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialDefeasance";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.PartialDefeasance.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.ExtendedEventType1Code
	 * ExtendedEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartialPrerefunding"</li>
	 * </ul>
	 */
	public static final ExtendedEventType1Code PartialPrerefunding = new ExtendedEventType1Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartialPrerefunding";
			owner_lazy = () -> com.tools20022.repository.codeset.ExtendedEventType1Code.mmObject();
			codeName = ExtendedEventTypeCode.PartialPrerefunding.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, ExtendedEventType1Code> codesByName = new LinkedHashMap<>();

	protected ExtendedEventType1Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("RPLA");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ExtendedEventType1Code";
				definition = "Specifies DTCC (The Depository Trust and Clearing Corporation) defined corporate action event type.";
				trace_lazy = () -> ExtendedEventTypeCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.ExtendedEventType1Code.RightsPlanAdoption, com.tools20022.repository.codeset.ExtendedEventType1Code.Termination,
						com.tools20022.repository.codeset.ExtendedEventType1Code.BonusRightsIssue, com.tools20022.repository.codeset.ExtendedEventType1Code.FullPrerefunding,
						com.tools20022.repository.codeset.ExtendedEventType1Code.PartialDefeasance, com.tools20022.repository.codeset.ExtendedEventType1Code.PartialPrerefunding);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(RightsPlanAdoption.getCodeName().get(), RightsPlanAdoption);
		codesByName.put(Termination.getCodeName().get(), Termination);
		codesByName.put(BonusRightsIssue.getCodeName().get(), BonusRightsIssue);
		codesByName.put(FullPrerefunding.getCodeName().get(), FullPrerefunding);
		codesByName.put(PartialDefeasance.getCodeName().get(), PartialDefeasance);
		codesByName.put(PartialPrerefunding.getCodeName().get(), PartialPrerefunding);
	}

	public static ExtendedEventType1Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static ExtendedEventType1Code[] values() {
		ExtendedEventType1Code[] values = new ExtendedEventType1Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, ExtendedEventType1Code> {
		@Override
		public ExtendedEventType1Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(ExtendedEventType1Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}