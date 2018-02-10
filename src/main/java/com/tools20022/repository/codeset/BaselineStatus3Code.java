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
import com.tools20022.repository.codeset.BaselineStatus3Code.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.lang.String;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.LinkedHashMap;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Indicates the status of a baseline.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getCode code} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#Proposed
 * BaselineStatus3Code.Proposed}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#Closed
 * BaselineStatus3Code.Closed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#PartiallyMatched
 * BaselineStatus3Code.PartiallyMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#Established
 * BaselineStatus3Code.Established}</li>
 * <li>{@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#Active
 * BaselineStatus3Code.Active}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#Complete
 * BaselineStatus3Code.Complete}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#AmendmentRequested
 * BaselineStatus3Code.AmendmentRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#ReActivateRequested
 * BaselineStatus3Code.ReActivateRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#CloseRequested
 * BaselineStatus3Code.CloseRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#CompleteRequested
 * BaselineStatus3Code.CompleteRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#StatusExtensionRequested
 * BaselineStatus3Code.StatusExtensionRequested}</li>
 * <li>
 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code#DataSetAcceptanceRequested
 * BaselineStatus3Code.DataSetAcceptanceRequested}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMCodeSet#getTrace trace} =
 * {@linkplain com.tools20022.repository.codeset.BaselineStatusCode
 * BaselineStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"PROP"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaselineStatus3Code"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the status of a baseline."</li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BaselineStatus3Code extends MMCode {

	final static private AtomicReference<MMCodeSet> mmObject_lazy = new AtomicReference<>();
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Proposed"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code Proposed = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Proposed";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.Proposed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Closed"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code Closed = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Closed";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.Closed.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyMatched"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code PartiallyMatched = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyMatched";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.PartiallyMatched.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Established"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code Established = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Established";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.Established.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Active"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code Active = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Active";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.Active.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Complete"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code Complete = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Complete";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.Complete.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code AmendmentRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.AmendmentRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReActivateRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code ReActivateRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReActivateRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.ReActivateRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CloseRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code CloseRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CloseRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.CloseRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CompleteRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code CompleteRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CompleteRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.CompleteRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StatusExtensionRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code StatusExtensionRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StatusExtensionRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.StatusExtensionRequested.getCodeName().orElse(name);
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMCode#getOwner owner} =
	 * {@linkplain com.tools20022.repository.codeset.BaselineStatus3Code
	 * BaselineStatus3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DataSetAcceptanceRequested"</li>
	 * </ul>
	 */
	public static final BaselineStatus3Code DataSetAcceptanceRequested = new BaselineStatus3Code() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DataSetAcceptanceRequested";
			owner_lazy = () -> com.tools20022.repository.codeset.BaselineStatus3Code.mmObject();
			codeName = BaselineStatusCode.DataSetAcceptanceRequested.getCodeName().orElse(name);
		}
	};
	final static private LinkedHashMap<String, BaselineStatus3Code> codesByName = new LinkedHashMap<>();

	protected BaselineStatus3Code() {
	}

	final static public MMCodeSet mmObject() {
		mmObject_lazy.compareAndSet(null, new MMCodeSet() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				example = Arrays.asList("PROP");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaselineStatus3Code";
				definition = "Indicates the status of a baseline.";
				trace_lazy = () -> BaselineStatusCode.mmObject();
				code_lazy = () -> Arrays.asList(com.tools20022.repository.codeset.BaselineStatus3Code.Proposed, com.tools20022.repository.codeset.BaselineStatus3Code.Closed,
						com.tools20022.repository.codeset.BaselineStatus3Code.PartiallyMatched, com.tools20022.repository.codeset.BaselineStatus3Code.Established, com.tools20022.repository.codeset.BaselineStatus3Code.Active,
						com.tools20022.repository.codeset.BaselineStatus3Code.Complete, com.tools20022.repository.codeset.BaselineStatus3Code.AmendmentRequested, com.tools20022.repository.codeset.BaselineStatus3Code.ReActivateRequested,
						com.tools20022.repository.codeset.BaselineStatus3Code.CloseRequested, com.tools20022.repository.codeset.BaselineStatus3Code.CompleteRequested,
						com.tools20022.repository.codeset.BaselineStatus3Code.StatusExtensionRequested, com.tools20022.repository.codeset.BaselineStatus3Code.DataSetAcceptanceRequested);
			}
		});
		return mmObject_lazy.get();
	}

	static {
		codesByName.put(Proposed.getCodeName().get(), Proposed);
		codesByName.put(Closed.getCodeName().get(), Closed);
		codesByName.put(PartiallyMatched.getCodeName().get(), PartiallyMatched);
		codesByName.put(Established.getCodeName().get(), Established);
		codesByName.put(Active.getCodeName().get(), Active);
		codesByName.put(Complete.getCodeName().get(), Complete);
		codesByName.put(AmendmentRequested.getCodeName().get(), AmendmentRequested);
		codesByName.put(ReActivateRequested.getCodeName().get(), ReActivateRequested);
		codesByName.put(CloseRequested.getCodeName().get(), CloseRequested);
		codesByName.put(CompleteRequested.getCodeName().get(), CompleteRequested);
		codesByName.put(StatusExtensionRequested.getCodeName().get(), StatusExtensionRequested);
		codesByName.put(DataSetAcceptanceRequested.getCodeName().get(), DataSetAcceptanceRequested);
	}

	public static BaselineStatus3Code valueOf(String codeName) {
		return codesByName.get(codeName);
	}

	public static BaselineStatus3Code[] values() {
		BaselineStatus3Code[] values = new BaselineStatus3Code[codesByName.size()];
		return codesByName.values().toArray(values);
	}

	protected static class InternalXmlAdapter extends XmlAdapter<String, BaselineStatus3Code> {
		@Override
		public BaselineStatus3Code unmarshal(String codeName) {
			return valueOf(codeName);
		}

		@Override
		public String marshal(BaselineStatus3Code codeObj) {
			return codeObj.getCodeName().orElse(null);
		}
	}
}